import java.util.Arrays;

public class Questions {
    public static QuestionSetup[] getQuestions(Category categoryFromFirstUser, Category categoryFromSecondUser) {

        QuestionSetup questionOne = new QuestionSetup(
                Category.History,
                "Who was the first president of the United States?",
                new String[]{"Abraham Lincoln", "Obama", "Donald Trump", "George Washington"},
                4
        );
        QuestionSetup questionTwo = new QuestionSetup(
                Category.History,
                "When was Alex born",
                new String[]{"Jan 21", "Obama", "Donald Trump", "George Washington"},
                1

        );
        QuestionSetup questionThree = new QuestionSetup(
                Category.Reality_TV,
                "Who flipped a table?",
                new String[]{"Meredith", "Teresa", "Nene", "Johnny Bananas"},
                2

        );
        QuestionSetup questionFour = new QuestionSetup(
                Category.Reality_TV,
                "What president was a Reality Tv Star?",
                new String[]{"Abraham Lincoln", "Obama", "Donald Trump", "George Washington"},
                3

        );

        QuestionSetup questionFive = new QuestionSetup(
                Category.Art,
                "Who painted the Mona Lisa?",
                new String[]{"Vincent Van Gogh", "Leonardo Da Vinci", "Claude Monet", "Pablo Picassso"},
                2

        );

        QuestionSetup questionSix = new QuestionSetup(
                Category.Art,
                "Who painted Starry Nights?",
                new String[]{"Vincent Van Gogh", "Leonardo da Vinci", "Claude Monet", "Pablo Picasso"},
                1

        );
        QuestionSetup questionSeven = new QuestionSetup(
                Category.Computers,
                "Which is not a programming language?",
                new String[]{"Java", "C++", "Python", "CPU"},
                4

        );
        QuestionSetup questionEight = new QuestionSetup(
                Category.Computers,
                "How do you make a comment in java? ",
                new String[]{"//", "comment:", "***", " : "},
                1

        );
        QuestionSetup[] everyQuestion = {questionOne, questionTwo, questionThree, questionFour, questionFive, questionSix, questionSeven, questionEight};

        return Arrays.stream(everyQuestion)
                .filter(question -> question.getCategory() == categoryFromFirstUser || question.getCategory() == categoryFromSecondUser)
                .toArray(QuestionSetup[]::new);




    }
}
