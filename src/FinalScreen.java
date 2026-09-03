import javax.swing.*;
import java.awt.*;


public class FinalScreen {
    public void theFinalScreen(JFrame frame, User firstUser,User secondUser, Scoring firstUserScore, Scoring secondUserScore) {

        frame.getContentPane().removeAll(); // removes the stuff from the frame

        frame.getContentPane().setBackground(new Color(250,240,255));

        JLabel title = new JLabel( "Game is finished", SwingConstants.CENTER); // Creating title Box
        title.setBounds(190,50,450,50);
        title.setFont(new Font("SansSerif",Font.BOLD,31));

        JLabel scoreNumberOne = new JLabel(firstUser.getUsers() + ": " + firstUserScore.getScoring(), SwingConstants.CENTER);       // Creating Score One Box
        scoreNumberOne.setBounds(190,140,450,40);
        scoreNumberOne.setFont(new Font("SansSerif", Font.BOLD,22));

        JLabel scoreNumberTwo = new JLabel(secondUser.getUsers() + ": " + secondUserScore.getScoring(), SwingConstants.CENTER);   // Creating Score Two Box
        scoreNumberTwo.setBounds(190,190,450,40);
        scoreNumberTwo.setFont(new Font("SansSerif", Font.BOLD,22));


        User[] users = { firstUser, secondUser};
        Scoring[] scores = { firstUserScore, secondUserScore};


        JLabel winnerBox = new JLabel("", SwingConstants.CENTER);
        winnerBox.setBounds(190,280,450,50);
        winnerBox.setFont(new Font("SansSerif", Font.BOLD, 26));

        if (WhoWon.incaseOfTies(scores)) {
            winnerBox.setText("Its a tie");
        } else {
            int letsGetTheWinner = WhoWon.letsGetTheWinner(scores);
            winnerBox.setText(users[letsGetTheWinner].getUsers() + ": is the winner");
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