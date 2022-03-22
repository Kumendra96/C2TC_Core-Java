package com.tns.example;
import java.util.Scanner;
public class SwapValue_without_Using_Third_Variable 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.print("Enter a value of A: ");
		int a=scan.nextInt();
		System.out.print("Enter a value of B: ");
		int b=scan.nextInt();
		System.out.println("--------------------------------");
		System.out.println("Before Swapping value of A:"+a);
		System.out.println("Before Swapping value of B:"+b);
		System.out.println("********************************");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("********************************");
		System.out.println("After Swapping value of A:"+a);
		System.out.println("After Swapping value of B:"+b);
		scan.close();
		System.out.println("--------------------------------");
	}
}
