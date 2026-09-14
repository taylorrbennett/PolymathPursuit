import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoringTest {
    @Test
    public void doesTheScoreStartAtZero() {
        Scoring score = new Scoring();
        assertEquals(0,score.getScoring());
    }

    @Test
    public void doesTheScoreGoUpByOne() {
        Scoring score = new Scoring();
        score.gainedPoints();
        assertEquals(1,score.getScoring());
    }
}


