package com.tns.example;

import java.util.Scanner;

public class ForLoop 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the value of you created the table:");
		Scanner scan= new Scanner(System.in);
		int i;
		i=scan.nextInt();
		for (i=i+1;i<10;i=i+i)
		{
			System.out.println(i+"*"+i+"=");
		}
	}
}
