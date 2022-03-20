package practices;
import java.util.*;
public class PrimeNumber 
{
	public static void main(String[] args)
	{
		int i=0,temp=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=scan.nextInt();
		for (i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				temp=1;
				break;
			}
		}
		if(temp==1)
			System.out.println("Number is not a prime:");
		else
			System.out.println("Number is prime:");
	}
}