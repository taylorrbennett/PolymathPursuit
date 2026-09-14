import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameplayTest {

    @Test
    public void isTheNameCorrect() {
        User firstUser = new User("Taylor");
        User secondUser = new User("Alex");

        Scoring firstScore = new Scoring();
        Scoring secondScore = new Scoring();

        Gameplay game = new Gameplay(firstUser,secondUser,firstScore,secondScore);

        assertEquals(firstUser,game.getTheNameOfTheCurrentUser());

    }
    @Test
    public void ifAnswerIsCorrectYouGetAPoint() {
        User firstUser = new User("taylor");
        User secondUser = new User("Alex");

        Scoring firstScore = new Scoring();
        Scoring secondScore = new Scoring();

        Gameplay game = new Gameplay(firstUser, secondUser, firstScore,secondScore);

        game.setFirstUserCategory(Category.History);
        game.setSecondUserCategory(Category.Reality_TV);

        game.beginGame();
        int answerIsCorrect = game.getCurrentQuestions().getCorrect();

        game.isItCorrect(answerIsCorrect);

        assertEquals(1,game.firstUserScore());
    }
    @Test
    public void ifTheTimeRunsOutThePlayerChanges() {

        User firstUser = new User("taylor");
        User secondUser = new User("Alex");

        Scoring firstScore = new Scoring();
        Scoring secondScore = new Scoring();

        Gameplay game = new Gameplay(firstUser, secondUser, firstScore,secondScore);

        game.setFirstUserCategory(Category.History);
        game.setSecondUserCategory(Category.Reality_TV);

        game.beginGame();

        game.theTimeRanOut();

        assertEquals(0, game.firstUserScore());
        assertEquals(secondUser,game.getTheNameOfTheCurrentUser());

    }
}