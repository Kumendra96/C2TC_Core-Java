package abstracts.com;

abstract class Cricket
{
   abstract void CSK();

	void KKR()
	{
		System.out.println("Team KKR...");
		System.out.println("Winner...");
	}
}	
class IPL extends Cricket
{
   void CSK() 
   {
      System.out.println("Team Chennai...");
      System.out.println("Winner...");
   }
}
public class AbstractDemo 
{
   public static void main(String[] args) {
      IPL i = new IPL();
      i.CSK();
   }
}