package practices;
import java.util.Scanner;
public class Fibonscci_Series 
{
	public static void main(String[] args) 
	{
		int fi=0,sc=1,res,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=scan.nextInt();
		System.out.println("fibonacci series is :");
		for (i=0;i<n;i++)
		{
			if(i<=1)
				res=i;
			else
			{
				res=fi + sc;
				fi=sc;
				sc=res;
			}
			System.out.println(res);
		}
	}
}