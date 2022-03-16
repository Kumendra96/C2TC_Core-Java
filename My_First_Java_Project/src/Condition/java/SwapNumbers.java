package Condition.java;

import java.util.Scanner;

public class SwapNumbers 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter value of A:");
		int a =scan.nextInt();
		System.out.println("Enter value of B:");
		int b =scan.nextInt();

		System.out.println("The Original value of A:"+a);
		System.out.println("The Original value of B:"+b);
		
		int temp=a;
			a=b;
			b=temp;
		System.out.println("-----------------------------");
		System.out.println("After Swaping value of A:"+a);
		System.out.println("After Swaping value of B:"+b);
		System.out.println("-----------------------------");
	}
}