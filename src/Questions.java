public class Questions {
    public static QuestionSetup[] getQuestions() {

        QuestionSetup questionOne = new QuestionSetup(
                "What is my middle name?", new String[]{"Renne", "Bennett", "Taylor", "Marie"}, 1 );

        QuestionSetup questionTwo = new QuestionSetup(
                "What is my favorite color?", new String[]{"blue", "pink", "purple", "black"}, 2);

        QuestionSetup[] questions ={questionOne, questionTwo};

        return questions;
    }
}
