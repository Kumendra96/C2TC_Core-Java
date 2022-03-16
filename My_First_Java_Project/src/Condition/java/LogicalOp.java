package Condition.java;

public class LogicalOp 
{
	public static void main(String[] args) 
	{
		System.out.println("For logical Operators:");
		boolean a=true;
		boolean b=false;
		if(a&&b)  //and operator
		{
			System.out.println("Yes!");
		}
		else
		{
			System.out.println("No!");
		}
		if(a||b) // not operator
		{
			System.out.println("Yes!");
		}
		else
		{
			System.out.println("No!");
		}
		if(a!=b) // not equal operator 
		{
			System.out.println("Yes!");
		}
		else
		{
			System.out.println("No!");
		}
	}
}