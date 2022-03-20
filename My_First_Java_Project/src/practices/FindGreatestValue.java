package practices;
import java.util.Scanner;
public class FindGreatestValue 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int f1=scan.nextInt();
		System.out.println("Enter second number:");
		int s2=scan.nextInt();
		System.out.println("Enter third number:");
		int t3=scan.nextInt();
		if((f1>s2) && (f1>t3))
			System.out.println("Firts is a gretest:"+f1);
		if((s2>f1)&&(s2>t3))
			System.out.println("Second is a gretest:"+s2);
		if((t3>f1)&&(t3>s2))
			System.out.println("Third is a gretest:"+t3);
	}
}