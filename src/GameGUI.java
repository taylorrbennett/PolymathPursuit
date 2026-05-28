import javax.swing.*;

public class GameGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Polymath Pursuit");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);



        JTextField textField = new JTextField();
        textField.setBounds(20,20,150,25);

        JLabel label = new JLabel("Welcome to Polymath Pursuit");
        label.setBounds(20,60,250,25);


        JButton button = new JButton("Play");
        button.setBounds(180,20,90,25);
        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!" );
        });



        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setVisible(true);

    }
}
