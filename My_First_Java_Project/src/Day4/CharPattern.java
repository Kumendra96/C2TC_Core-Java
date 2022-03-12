package Day4;

import java.util.Scanner;

public class CharPattern
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the value of No:");
		int no=scan.nextInt();
		no=(no+1)/2;
		char ch='K';
		for (int i=0;i<no;i++)
		{
			for (int j=0;j<no-1;j++)
			{
				System.out.print("");
			}
			int k=0;
			for (int j=0;j<2*i+1;j++)
			{
				System.out.print(""+(char)(ch+k));
				if(j<(2*i+1)/2)
				k++;
				else
					k--;
			}
			System.out.println();
		}
		no=no-1;
		for (int i=0;i<no;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("");
			}
			int k=0;
			for(int j=0;j<2*(no-1)-1;j++)
			{
				System.out.print(""+(char)(ch+k));
				if(j<(2*(no-1)-1)/2)
					k++;
				else
					k--;
			}
			System.out.print("");
		}
		
	}
}