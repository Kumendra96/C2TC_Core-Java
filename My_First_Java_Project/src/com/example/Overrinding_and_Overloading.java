package com.example;

class A //Super class
{
	public void m1()
	{
		System.out.println("Hello Everyone!!!");
	}
}

class B extends A
{
	public void m2()
	{
		System.out.println("Welcome to C2TC Training...");
	}
	public void m1()
	{
		System.out.println("Day 2");
	}
	public void area(String a,int f)
	{
		
	}
	public void area(int a ,String c,float b)
	{
		
	}
	
}
public class Overrinding_and_Overloading extends B
{
	public static void main(String[] args) 
	{
		A a,a1;
		a=new A();
	}
}