import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionsFromSqlTest {
    @Test
    public void areTheQuestionsLoading() {
        QuestionSetup[] questions = QuestionsFromSql.getQuestionsFromSql(Category.History, Category.Art);

        assertNotNull(questions);
        assertTrue(questions.length > 0);
    }

    @Test
    public void theGameIsTenQuestions() {
        QuestionSetup[] questions = QuestionsFromSql.getQuestionsFromSql(Category.History, Category.Art);


        assertEquals(10,questions.length);
    }
}
