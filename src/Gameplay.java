public class Gameplay {
    private User firstUser;
    private User secondUser;
    private Scoring firstUserScore;
    private Scoring secondUserScore;
    private Category firstUserCategory;
    private Category secondUserCategory;
    private QuestionSetup[] questions;
    private int currentQuestions;
    private int switchTurnsUser;
    private boolean gameFinished = false;

public Gameplay (User firstUser,User secondUser, Scoring firstUserScore, Scoring secondUserScore) {
    this.firstUser = firstUser;
    this.secondUser = secondUser;

    this.firstUserScore = firstUserScore;
    this.secondUserScore = secondUserScore;


    this.currentQuestions = 0;
    this.switchTurnsUser = 1;
}

    public void setFirstUserCategory(Category category) {
    firstUserCategory = category;
    }

    public void setSecondUserCategory(Category category) {
    secondUserCategory = category;
    }

    public void beginGame() {
        loadQuestions();
    }

    public void loadQuestions(){
    questions = QuestionsFromSql.getQuestionsFromSql(firstUserCategory, secondUserCategory);
    }

    public void nextTurn() {
    if( switchTurnsUser == 1) {
        switchTurnsUser = 2;
    } else {
        switchTurnsUser = 1;
    }                               // this changes turns
        nextQuestion();
    }

    public User getTheNameOfTheCurrentUser() {
    if ( switchTurnsUser == 1) {
        return firstUser;
    } else {
        return secondUser;
    }
    }

    public User getFirstUser() {
        return firstUser;
    }
    public User getSecondUser() {
        return secondUser;
    }
    public Scoring getFirstUserScoringTurnedIntoObject() {
        return firstUserScore;
    }
    public Scoring getSecondUserScoringTurnedIntoObject() {
        return secondUserScore;
    }

    public QuestionSetup getCurrentQuestions() {
        return questions[currentQuestions];

    }
    public void isItCorrect(int answer) {
        if (answer == getCurrentQuestions().getCorrect()) {
            System.out.println("correct");

        if (switchTurnsUser == 1) {
            firstUserScore.gainedPoints();
            System.out.println("Score: " + firstUserScore.getScoring());
        } else {
            secondUserScore.gainedPoints();
            System.out.println("Score: " + secondUserScore.getScoring());
        }
    }  else {
            System.out.println("not correct");
        }
        nextTurn();
    }
    public int firstUserScore() {
    return firstUserScore.getScoring();
    }
    public int secondUserScore() {
    return secondUserScore.getScoring();
    }

    public void nextQuestion() {
    if (currentQuestions < questions.length - 1) {
        currentQuestions++;
    } else {
        gameIsFinished();
    }}

    public void gameIsFinished() {
        gameFinished = true;
    }
    public boolean isGameFinishedForreal() {
        return gameFinished;
    }
}
