package com.example;

import java.util.Scanner;

public class ArmstrongNumber 
{
	static boolean armstrong(int num)
	{
		int temp=0, count=0, last=0;
		double sum=0;
		temp=num;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		temp=num;
		while(temp>0)
		{
			last=temp%10;
			sum=sum+Math.pow(last, count);
			temp=temp/10;
		}
		if(num==sum)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter any Number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("The no is:"+num);
		if(armstrong(num))
		{
			System.out.println(num+":is armstrong no");
		}
		else
		{
			System.out.println(num+":is not armstrong no.");
		}
	}
}