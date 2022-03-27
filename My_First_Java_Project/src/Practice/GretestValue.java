package Practice;
import java.util.Scanner;
public class GretestValue 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter a \"First\" No:");
		int a=scan.nextInt();
		System.out.print("Enter a \"Second\" No:");
		int b=scan.nextInt();
		System.out.print("Enter a \"Third\" No:");
		int c=scan.nextInt();
		if((a>b)&&(a>c))
			System.out.println("A is greater:\n"+a);
		if((b>a)&&(b>c))
			System.out.println("B is greater:\n"+b);
		if((c>a)&&(c>b))
			System.out.println("C is greater:\n"+c);
		scan.close();
	}
}