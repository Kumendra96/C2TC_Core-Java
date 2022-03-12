package Day4;

import java.util.Scanner;

public class StrPractic 
{
	public static void main(String[] args) 
	{
		String name="RAKEsh";
		System.out.println(name.toLowerCase());
		String txt="To my          friend ";
		txt=txt.replace (" ", "_");
		System.out.println(txt);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name:");
		String a=scan.next();
		String letter="Dear name,Thanks a lot";
		letter = letter.replace("name", a);
		System.out.println(letter);	
		String Eagle="Eagle is a    bird";
		System.out.println("Index of Eagle String "+Eagle.indexOf("   "));
	}
}