import javax.swing.*;
import java.awt.*;

public class StartScreen {

    public void theStartScreen (JFrame frame) {

        // Color
        frame.getContentPane().removeAll();
        frame.getContentPane().setBackground(new Color(250,240,255));


     // Title
        JLabel title = new JLabel("Polymath Pursuit", SwingConstants.CENTER);
        title.setBounds(190,40,450,45);
        title.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD,32));

    // Subtitle
        JLabel subTitle = new JLabel ("Enter your names to play!", SwingConstants.CENTER);
        subTitle.setBounds(190, 90, 450,35);
        subTitle.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 20));

     // First User
    JTextField firstUserField = new JTextField();
        firstUserField.setBounds(300,155,250,35);
        firstUserField.setBorder(BorderFactory.createLineBorder( new Color(255,182,193), 2));
        firstUserField.setMargin(new Insets(5,8,5,8));

    JLabel firstUserLabel = new JLabel("Player 1: ");
        firstUserLabel.setBounds(220,155,80,30);



        // Second User
    JTextField secondUserField = new JTextField();
        secondUserField.setBounds(300,210, 250, 35);
        secondUserField.setBorder(BorderFactory.createLineBorder(new Color(255,182,193),2));
        secondUserField.setMargin(new Insets(5,8,5,8));

    JLabel secondUserLabel = new JLabel("Player 2: ");
        secondUserLabel.setBounds(220,210,80,30);



// Play Button
    JButton playButton = new JButton("Play");
        playButton.setBounds(315,285,200,50);
        playButton.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD,18));
        playButton.setBackground(new Color(255,182,193));    // actual button
        playButton.setForeground(Color.WHITE);   // words
        playButton.setOpaque(true);
        playButton.setBorderPainted(false);
        playButton.setFocusPainted(false);




        playButton.addActionListener(e -> {
        String firstName = firstUserField.getText();
        String secondName = secondUserField.getText();

        User firstUser= new User(firstName);                // making the strings objects
        User secondUser = new User(secondName);             // making the strings objects

        Scoring firstUserScore = new Scoring();
        Scoring secondUserScore = new Scoring();

        Gameplay gamePlay = new Gameplay(firstUser,secondUser, firstUserScore,secondUserScore);

        CategoryScreen categoryScreen = new CategoryScreen();
        categoryScreen.theCategoryScreen(frame,gamePlay,1,firstName,secondName);

    });


        frame.add(title);
        frame.add(subTitle);
        frame.add(firstUserField);
        frame.add(secondUserField);
        frame.add(secondUserLabel);
        frame.add(firstUserLabel);
        frame.add(playButton);


        frame.setVisible(true);

    }
}


