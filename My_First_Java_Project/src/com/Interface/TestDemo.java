package com.Interface;

interface Bank
{
	float rateOfInterest();
}
class Sbi implements Bank
{
	public float rateOfInterest()
	{
		return 9.15f;
	}
}
class Boi implements Bank
{
	public float rateOfInterest()
	{
		return 9.25f;
	}
}

public class TestDemo 
{
	public static void main(String[] args) 
	{
		Bank s= new Sbi();
		Bank b=new Boi();
		System.out.println("Rate of Interest 'Bank Of India' "+b.rateOfInterest());
		System.out.println("Rate of Interest 'State Bank of India' "+s.rateOfInterest());
	}
}
