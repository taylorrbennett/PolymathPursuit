import javax.swing.*;
import java.awt.*;


public class FinalScreen {
    public void theFinalScreen(JFrame frame, User firstUser,User secondUser, Scoring firstUserScore, Scoring secondUserScore) {

        frame.getContentPane().removeAll(); // removes the stuff from the frame

        frame.getContentPane().setBackground(new Color(250,240,255));

        JLabel title = new JLabel( "Game is finished", SwingConstants.CENTER); // Creating title Box
        title.setBounds(400,100,700,60);
        title.setFont(new Font("SansSerif",Font.BOLD,36));

        JLabel scoreNumberOne = new JLabel(firstUser.getUsers() + ": " + firstUserScore.getScoring(), SwingConstants.CENTER);       // Creating Score One Box
        scoreNumberOne.setBounds(450,220,600,45);
        scoreNumberOne.setFont(new Font("SansSerif", Font.BOLD,24));

        JLabel scoreNumberTwo = new JLabel(secondUser.getUsers() + ": " + secondUserScore.getScoring(), SwingConstants.CENTER);   // Creating Score Two Box
        scoreNumberTwo.setBounds(450,280,600,44);
        scoreNumberTwo.setFont(new Font("SansSerif", Font.BOLD,24));


        User[] users = { firstUser, secondUser};
        Scoring[] scores = { firstUserScore, secondUserScore};


        JLabel winnerBox = new JLabel("", SwingConstants.CENTER);
        winnerBox.setBounds(400,390,700,60);
        winnerBox.setFont(new Font("SansSerif", Font.BOLD, 30));

        if (WhoWon.incaseOfTies(scores)) {
            winnerBox.setText("It's a tie");
        } else {
            int letsGetTheWinner = WhoWon.letsGetTheWinner(scores);
            winnerBox.setText(users[letsGetTheWinner].getUsers() + " is the winner!");
        }



        frame.add(title);
        frame.add(scoreNumberOne);
        frame.add(scoreNumberTwo);
        frame.add(winnerBox);

        frame.repaint();
        frame.revalidate();
    }
}



// 