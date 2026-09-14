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


