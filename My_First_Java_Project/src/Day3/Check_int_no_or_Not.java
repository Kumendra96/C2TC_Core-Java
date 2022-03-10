package Day3;

import java.util.Scanner;

public class Check_int_no_or_Not 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any Number:");
		Scanner scan=new Scanner(System.in);
		System.out.println(scan.hasNextInt()); // ans True or false
	}
}