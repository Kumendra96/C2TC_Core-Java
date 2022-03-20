package Condition.java;

public class Constructor
{
	int id;
	String n;
	String cname;
	Constructor(int i,String name ,String clgname)
	{
		id=i;
		n=name;
		cname=clgname;
	}
	void display()
	{
		System.out.println(n +" "+ id+" "+cname);
	}
	public static void main(String[] args) 
	{
		Constructor s1=new Constructor(111, "Kumendra","NIETM");
		Constructor s2=new Constructor(222, "Rakesh","NIETM");
		s1.display();
		s2.display();
	}
}