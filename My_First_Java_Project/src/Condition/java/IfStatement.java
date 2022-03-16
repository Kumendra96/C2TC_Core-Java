package Condition.java;

import java.util.Scanner;

public class IfStatement 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your age :");
		int age;
		Scanner scan=new Scanner(System.in);
		age=scan.nextInt();
		if(age>=18 && age<=100)
		{
			System.out.println("Yes Your eligible for the vote:!");
		}
		else
		{
			System.out.println("No your not eligible of the vote:!");
		}
		System.out.println(scan);
	}
}