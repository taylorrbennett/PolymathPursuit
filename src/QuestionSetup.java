public class QuestionSetup {
    public String questions;
    public String[] choices;
    public int correct;

    public QuestionSetup(String questions, String[] choices, int correct) {
        this.questions = questions;
        this.choices = choices;
        this.correct = correct;
    }
    public String getQuestions() {
        return questions;
    }
    public String[] getChoices() {
        return choices;
    }
    public int getCorrect() {
        return correct;
    }
}
//A question set up will be the question, the multi choice option, and selecting A,B,C,D - want to get questions set up in here first