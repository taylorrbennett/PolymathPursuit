import javax.swing.*;
import java.awt.*;


public class QuestionScreen {
    public void theQuestionScreen(JFrame frame, Gameplay game) {

        frame.getContentPane().removeAll();
        frame.getContentPane().setBackground(new Color (250,240,255));

        QuestionSetup currentQuestion = game.getCurrentQuestions();

        String[] questionChoices = currentQuestion.getChoices();

        int y = 170;

        for (int i = 0; i < questionChoices.length; i ++){
            JButton answerButton = new JButton(questionChoices[i]);
            answerButton.setBounds(190,y,450,60);
            answerButton.setFont(new Font("SansSerif", Font.BOLD, 16));
            int answerNumber = i +1; //starts at 0
            answerButton.addActionListener(e -> { game.isItCorrect(answerNumber);
            });
            frame.add(answerButton);
            y= y + 80;

        }

        JLabel questionLabel = new JLabel(currentQuestion.getQuestions(),SwingConstants.CENTER);

        questionLabel.setBounds(140,70,550,50);

        questionLabel.setFont( new Font ("SansSerif", Font.BOLD, 18));

        frame.add(questionLabel);

        frame.revalidate();
        frame.repaint();

    }
}
