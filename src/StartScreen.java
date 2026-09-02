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

    JLabel firstUserLabel = new JLabel("Player 1: ");
        firstUserLabel.setBounds(220,155,80,30);


        // Second User
    JTextField secondUserField = new JTextField();
        secondUserField.setBounds(300,210, 250, 35);

    JLabel secondUserLabel = new JLabel("Player 2: ");
        secondUserLabel.setBounds(220,210,80,30);



// Play Button
    JButton button = new JButton("Play");
        button.setBounds(150,210,140,40);
        button.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD,18));
        button.addActionListener(e -> {
        String firstName = firstUserField.getText();
        String secondName = secondUserField.getText();

        User firstUser= new User(firstName);                // making the strings objects
        User secondUser = new User(secondName);             // making the strings objects

    });


        frame.add(title);
        frame.add(subTitle);
        frame.add(firstUserField);
        frame.add(secondUserField);
        frame.add(secondUserLabel);
        frame.add(firstUserLabel);
        frame.add(button);


        frame.setVisible(true);

    }
}


