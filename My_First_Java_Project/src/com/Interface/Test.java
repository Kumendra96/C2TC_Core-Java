package com.Interface;

interface Demo
{
	final String a = "Everyone";
	
	void m1();
}
public class Test implements Demo
{
	public void m1()
	{
		System.out.println("Hello,");
	}
	public static void main(String [] args)
	{
		Test t1= new Test();
		t1.m1();
		System.out.println(a);
	}
}