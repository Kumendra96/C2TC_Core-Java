package abstracts.com;

abstract class Matchday
{
   abstract void CSK();
   void KKR()
   {
      System.out.println("Team Kolkata...");
   }
}
class Match extends Matchday 
{
   void CSK() 
   {
      System.out.println("Team Chennai...");
   }
}
public class AbstractDemo2
{
   public static void main(String[] args) 
   {
      Match i = new Match();
      i.CSK();
      i.KKR();
   }
}