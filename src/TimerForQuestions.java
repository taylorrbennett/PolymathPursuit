import javax.swing.*;

public class TimerForQuestions {

    private javax.swing.Timer timer;
    private int itsTheTimeLeft;

    public TimerForQuestions( int seconds, JLabel timerLabel, Runnable timeUpAction) {
        this.itsTheTimeLeft = seconds;
        timerLabel.setText("Time: " + itsTheTimeLeft);

        timer = new javax.swing.Timer(1000, e -> {

            itsTheTimeLeft--;

            timerLabel.setText("Time: " + itsTheTimeLeft);


        if(itsTheTimeLeft <= 0){

            timer.stop();

            timeUpAction.run();
            }
        });
    }
    public void start() {
        timer.start();
    }
    public void stop() {
        timer.stop();
    }
}
