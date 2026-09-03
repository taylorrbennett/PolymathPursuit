import javax.swing.*;
import java.awt.*;


public class QuestionScreen {
    public void theQuestionScreen(JFrame frame, Gameplay game) {

        frame.getContentPane().removeAll();
        frame.getContentPane().setBackground(new Color (250,240,255));

        QuestionSetup currentQuestion = game.getCurrentQuestions();

        User currentUser = game.getTheNameOfTheCurrentUser(); // shows who is answering

        String[] questionChoices = currentQuestion.getChoices();

        int y = 170;

        for (int i = 0; i < questionChoices.length; i ++){
            JButton answerButton = new JButton(questionChoices[i]);
            answerButton.setBounds(190,y,450,60);
            answerButton.setFont(new Font("SansSerif", Font.BOLD, 16));
            int answerNumber = i +1; //starts at 0
            answerButton.addActionListener(e -> { game.isItCorrect(answerNumber);
                if (game.isGameFinishedForreal()) {
                    FinalScreen finalyScreen = new FinalScreen();
                    finalyScreen.theFinalScreen(frame,game.getFirstUser(),game.getSecondUser(),game.getFirstUserScoringTurnedIntoObject(), game.getSecondUserScoringTurnedIntoObject());
                } else {
                    theQuestionScreen(frame, game); // this allows for the change of user, and then question
                }
            });
            frame.add(answerButton);
            y = y + 80;
        }

        JLabel questionLabel = new JLabel(currentQuestion.getQuestions(),SwingConstants.CENTER);
        questionLabel.setBounds(140,70,550,50);
        questionLabel.setFont( new Font ("SansSerif", Font.BOLD, 18));
        frame.add(questionLabel);

        JLabel whoIsPlayingLabel = new JLabel(currentUser.getUsers() + "'s turn!",SwingConstants.CENTER);
        whoIsPlayingLabel.setBounds(190,20,450,35);
        whoIsPlayingLabel.setFont(new Font("SansSerif", Font.BOLD,18));
        frame.add(whoIsPlayingLabel);

        JLabel firstScoreLabel = new JLabel(game.getFirstUser().getUsers() + ": " + game.firstUserScore());
        JLabel secondScoreLabel = new JLabel (game.getSecondUser().getUsers() + ": " + game.secondUserScore());
        firstScoreLabel.setBounds(30,20,150,30);
        secondScoreLabel.setBounds(650,20,150,30);

        firstScoreLabel.setFont(new Font("SansSerif",Font.BOLD,16));
        secondScoreLabel.setFont(new Font("SansSerif", Font.BOLD,16));

        frame.add(firstScoreLabel);
        frame.add(secondScoreLabel);


        frame.revalidate();
        frame.repaint();

    }
}
