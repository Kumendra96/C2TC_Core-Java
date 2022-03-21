package com.tns.example;
import java.util.Scanner;
public class SumOfDigits
{
	static int sum=0,rem;
	static int sumOfDigits(int num)
	{
		sum=sum+(num%10);
		rem=num/10;
		if(rem>0)
		{
			sumOfDigits(rem);
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int result ;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number:");
		int originalNum=scan.nextInt();
		result =SumOfDigits.sumOfDigits(originalNum);
		System.out.println("Sum = "+result);
	}
}