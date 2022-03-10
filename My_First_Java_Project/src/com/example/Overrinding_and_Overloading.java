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
class D
{
	public D()
	{
		
	}
	public void m1()
	{
		System.out.println("Hello Everyone...");
	}
}
public class Overrinding_and_Overloading
{
	public static void main(String[] args) 
	{
		A a,a1;
		B b;
		a=new A();
		b=new B();
		a1=a;
		a1.m1();
		a1=b;
		b.m1();
		a1.m1();
		D d =new D();
		d.m1();		
		b.m2();
	}
}