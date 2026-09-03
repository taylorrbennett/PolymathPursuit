public class Main {
    public static void main (String[] args) {


      try{
          QuestionsFromSql.connect();
          System.out.println("Database !");
      } catch (Exception e){
          System.out.println("not work");
          e.printStackTrace();
      }

      GameGUI secondGui = new GameGUI();
        secondGui.oopsieGui();
    }
}


//timer, randomize questions, bigger database - alex suggestions
// add large question bank
// randomize question bank so its swithcing between different categories
// add timer
// make GUI nicer
// if i can - make multiplayer into more than two,

//Rules - Once a question has been used, it doesnt come back - change next turn()