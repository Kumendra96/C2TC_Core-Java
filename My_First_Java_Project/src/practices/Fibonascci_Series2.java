package practices;
import java.util.*;
public class Fibonascci_Series2 
{
	public static void main(String[] args)
	{
		int i,k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = scan.nextInt();
		System.out.println("Fibonascci series is :");
		for(i=0;i<n;i++)
		{
			System.out.println(Fibonascci_Series2.fibonacci(i));
		}
	}
	static int fibonacci(int i)
	{
		if(i==0) return 0;
		else if(i==1) return 1;
		else return(fibonacci(i-1)+fibonacci(i-2));
	}
}