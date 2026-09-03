import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class QuestionsFromSql {



    private static final String URL = "jdbc:sqlite:polymath_pursuit.db";

    public static Connection connect()
            throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static QuestionSetup[] getQuestionsFromSql(Category firstUserCategory, Category secondUserCategory){
        System.out.println(new java.io.File("polymath_pursuit.db").getAbsolutePath());
        String sql = "SELECT * FROM PolymathPursuit WHERE category = ? OR category = ?";
        ArrayList <QuestionSetup> questionsFromSql = new ArrayList<>(); // after creating objects from the table - put them in this little array

        try {
            Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, firstUserCategory.getCategories());
            statement.setString(2, secondUserCategory.getCategories());

            System.out.println("Player 1 category: " + firstUserCategory.getCategories());
            System.out.println("Player category: " + secondUserCategory.getCategories());



            ResultSet results = statement.executeQuery();
            while (results.next()) {
                String category = results.getString("category"); //category
                Category categoryInfo = null;

                if (category.equals("History")){
                    categoryInfo = Category.History;
                }
                if (category.equals("Reality TV")){
                    categoryInfo = Category.Reality_TV;
                }
                if (category.equals("Art")){
                    categoryInfo = Category.Art;
                }
                if (category.equals("Computers")){
                    categoryInfo = Category.Computers;
                }


                String question = results.getString("question");   // question

                String[] choices = {results.getString("choice1"), results.getString("choice2"),results.getString("choice3"),results.getString("choice4")}; // choices

                int correct = results.getInt("correct");                // correct?

                QuestionSetup questionFromSql = new QuestionSetup(categoryInfo, question, choices, correct); // feeding this into question setup

                questionsFromSql.add(questionFromSql);    // adds them to array

                System.out.println(questionFromSql.getQuestions());

            }
            System.out.println("questions loaded : " + questionsFromSql.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return questionsFromSql.toArray(new QuestionSetup[0]);
    }

}
