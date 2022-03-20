package practices;
import java.util.*;
public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int rev =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please give a no.:");
		int i=scan.nextInt();
		while(i!=0)
		{
			rev = rev *10 +i%10;
			i=i/10;
		}
		System.out.println("Number after revese:"+rev);
	}
}