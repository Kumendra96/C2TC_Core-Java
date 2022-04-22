package com.equal;

class Aa
{
	
}
class Ab
{
	int i;
	String s;

	public Ab(int i,String s)
	{
		this.i=i;
		this.s=s;
	}
}

public class EqualDemo 
{
	public static void main(String[] args) 
	{
		Aa a = new Aa(); //ref 1
		Aa a1 = a;
		Aa a2 = new Aa(); //ref 2
		
		Ab b = new Ab(50,"Kumendra"); //ref1
		Ab b1 = b;
		Ab b2 = new Ab(50,"Kumendra"); //ref 2
		if(b==b1) //equal
			System.out.println("equal");
		else
			System.out.println("not equal");
		if (b==b2)
			System.out.println("Equal");
		else
			System.out.println("not equal");
		if(b.equals(b1))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(b.equals(b2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
//14