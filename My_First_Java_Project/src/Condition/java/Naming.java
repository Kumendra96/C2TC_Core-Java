package Condition.java;

import java.util.Scanner;


public class Naming 
{
	private static final Readable InputStream = null;

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
//		Scanner scan1=new Scanner(InputStream name);
//		Scanner scan2=new Scanner(File file);
//		Scanner scan3=new Scanner(String str);
		
		System.out.println("Enter Your Name:");
		String name=scan.nextLine();

		System.out.println(name);
		System.out.println(scan);
//		System.out.println(scan1);
		scan.close();
	}
}