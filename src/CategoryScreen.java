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

        categoryTitle.setBounds(200,70,1100,50);

        categoryTitle.setFont(new Font("SansSerif", Font.BOLD,30));

        frame.add(categoryTitle); // adding the title to the frame


        Category[] categories = {Category.History,Category.Reality_TV, Category.Art, Category.Computers};

        // Category Titles loop - makes scalable easier

      int x = 425;
      int y = 180;

      for (int i = 0; i < categories.length; i++) {

          Category category = categories[i];

          JButton categoryButton = new JButton(category.getCategories());
          categoryButton.setBounds(x,y,280,85);
          categoryButton.setFont(new Font("SansSerif", Font.BOLD,19));

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

          x += 350;   // button to right

          if(x > 775) {     // button back left
            x = 425;
            y+= 120;        // button down
          }
      }
        frame.revalidate();
        frame.repaint();



    }
}
