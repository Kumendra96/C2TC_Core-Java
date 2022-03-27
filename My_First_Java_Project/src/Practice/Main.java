package Practice;
abstract class CricketLeague {
   abstract void CSK();
   void KKR(){
      System.out.println("Team Kolkata...");
   }
}
class IPL extends CricketLeague {
   @Override
   void CSK() {
      System.out.println("Team Chennai...");
   }
}
public class Main {
   public static void main(String[] args) {
      IPL i = new IPL();
      i.CSK();
      i.KKR();
   }
}