package com.tns.example;

import java.util.Scanner;

public class StrPallindrome 
{
	public static void main(String[] args) 
	{
		String a,b = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string you want to check:");
		a=scan.nextLine();
		int n= a.length();
		int i;
		for (i =n-1; i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if (a.equalsIgnoreCase(b))
		{
			System.out.println("The String is pallindrome:");
		}
		else
		{
			System.out.println("The String is not pallindrome:");
		}
		scan.close();
	}
}