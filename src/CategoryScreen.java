import javax.swing.*;
import java.awt.*;


public class CategoryScreen {
    public void theCategoryScreen(JFrame frame, Gameplay gamePlay,int userNumber, String firstName, String secondName) {

        // first have to remove the screen from before

        frame.getContentPane().removeAll();

        // whose turn is it anyways

        String currentName;
        if (userNumber == 1) {
            currentName = firstName;
        }else {
            currentName = secondName;
        }

        // new frame

        frame.getContentPane().setBackground(new Color(250,240,255));

        //Title

        JLabel categoryTitle = new JLabel( currentName+ ", you can choose your Category!", SwingConstants.CENTER);

        categoryTitle.setBounds(190,60,450,45);

        categoryTitle.setFont(new Font("SansSerif", Font.BOLD,28));

        frame.add(categoryTitle); // adding the title to the frame


        Category[] categories = {Category.History,Category.Reality_TV, Category.Art, Category.Computers};

        // Category Titles loop - makes scalable easier

      int x = 190;
      int y = 160;

      for (int i = 0; i < categories.length; i++) {

          Category category = categories[i];

          JButton categoryButton = new JButton(category.getCategories());
          categoryButton.setBounds(x,y,200,70);
          categoryButton.setFont(new Font("SansSerif", Font.BOLD,17));

          categoryButton.setOpaque(true);
          categoryButton.setBorderPainted(false);
          categoryButton.setFocusPainted(false);

          categoryButton.addActionListener( e -> {
              if (userNumber == 1) {
                  gamePlay.setFirstUserCategory(category);
                  theCategoryScreen(frame,gamePlay,2,firstName,secondName);
              } else {
              gamePlay.setSecondUserCategory(category);
              gamePlay.beginGame();
              QuestionScreen questionScreen = new QuestionScreen();
              questionScreen.theQuestionScreen(frame,gamePlay);
          }});

          frame.add(categoryButton);

          x += 250;   // button to right

          if(x > 440) {     // button back left
            x = 190;
            y+= 100;        // button down
          }
      }
        frame.revalidate();
        frame.repaint();



    }
}
