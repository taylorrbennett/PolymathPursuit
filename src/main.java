public class main {
    public static void main(String[] args) {
    User user = new User("Taylor", "Aboutme",0);

    Scoring score = new Scoring();

    QuestionSetup[] questions = Questions.getQuestions();

    System.out.println(user.getUser());
    System.out.println(user.getCategory());

    System.out.println("Amount of Questions: " + questions.length);

    System.out.println();
        System.out.println(questions[0].getQuestions());
    }
}