package com.tns.example;
import java.util.*;
public class PrimeFactore 
{
	public static void main(String [] args)
	{
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n=scan.nextInt();
		System.out.println("Prime factores of a given number:");
		while(n%2==0)
		{
			System.out.println(2+",");
			n=n/2;
		}
		for(i=3;i<=Math.sqrt(n);i=i+2)
		{
			while(n%i==0)
			{
				System.out.println(i+",");
				n=n/i;
			}
		}
		if(n>2)
		{
			System.out.println(n+",");
		}
	}
}