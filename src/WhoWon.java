public class WhoWon {

    public static int letsGetTheWinner( Scoring[] scores) {

        int theWinner = 0;

        for( int i = 0; i < scores.length; i++) {
            if (scores[i].getScoring() > scores[theWinner].getScoring()) {
                theWinner = i;
            }
        }
        return theWinner;
    }
    public static boolean incaseOfTies(Scoring[] scores) {
        int theWinner = letsGetTheWinner(scores); // find the highest

        int whatIsTheHighest = scores[theWinner].getScoring(); // gets the highest

        int amountOfWinners = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i].getScoring() == whatIsTheHighest) {
                amountOfWinners++;
            }
        }
        return amountOfWinners > 1; // has to be > bc boolean, its true or false

    }








}
