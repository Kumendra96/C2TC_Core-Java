package Day3;

class A
{
	public A()
	{
		super();
		int i;
	}
	public A(String s)
	{
		int j;
	}
	public void m1()
	{
		System.out.println("Hello Everyone !!!");
	}
}

class B extends A
{
	public B()
	{
		super();
		int l;
	}
	public void m2()
	{
		System.out.println("Welcome to C2TC");
	}
	public void m1()
	{
		System.out.println("Good Morning!!");
	}
	public void m1(String s)
	{
		System.out.println(s);
	}
}

class D extends Object
{
	public D()
	{
	}
	public void m1()
	{
		System.out.println("Hello Everyone!!");
	}
}

public class Super 
{
	public static void main(String[] args) 
	{
		A a,a1;
		B b;
		a=new A("kumendra");
		a=new A();
		b=new B();
		a1=a;
		a1.m1();
		a1=b;
		b.m1();
		a1.m1();
		D d=new D();
		d.m1();
	}
}