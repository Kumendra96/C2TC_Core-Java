package com.Revision;

class Student
{
	int roll_no;
	String name;
	static String College ="NIETM";
	
	public Student (int r,String n)
	{
		roll_no = r;
		name = n;
	}
	
	void disply()
	{
		System.out.println(roll_no + " "+name + " "+ College);
	}
}
public class Variables
{
	public static void main(String[] args)
	{
		Student s1 = new Student(111,"Kumendra");
		Student s2 = new Student(222,"Rakesh");
		s1.disply();
		s2.disply();
	}
}
