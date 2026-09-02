import javax.swing.*;

public class GameGUI {
        public void oopsieGui() {

                JFrame frame = new JFrame("Polymath Pursuit");
                frame.setSize(800, 700);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(null);

                StartScreen startScreenCall = new StartScreen();

                startScreenCall.theStartScreen(frame); // class.method

                frame.setVisible(true);


        }}