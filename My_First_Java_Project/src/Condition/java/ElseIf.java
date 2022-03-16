package Condition.java;

import java.util.Scanner;

public class ElseIf 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your age:");
		Scanner scan=new Scanner(System.in);
		int age= scan.nextInt();
		if(age>56)
		{
			System.out.println("You are experienced!");
		}
		else if(age>46)
		{
			System.out.println("You are semi semi experienced!");
		}
		else if (age >36)
		{
			System.out.println("You are semi semi experienced!");
		}
		else if(age >30)
		{
			System.out.println("You are not experienced!");
		}
		else;
		System.out.println("Fresher...!"); 
	}
}