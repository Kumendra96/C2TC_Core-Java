package Condition.java;
import java.util.Scanner;
public class Report_Statement
{
	public static void main(String[] args) 
	{
		int r_no,j_m,py,cpp,net,c;
		int total_marks;
		float percent;
		String grade = null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=scan.nextLine();
		while(true)
		{
			System.out.println("Enter Roll Number:");
			r_no=scan.nextInt();
			if(r_no>=100 && r_no<=200)
				break;
		}
		while (true)
		{
			System.out.println("Enter a java Marks:");
			j_m=scan.nextInt();
			if(j_m>0 && j_m<=100)
				break;
		}
		while(true)
		{
			System.out.println("Enter a c Marks:");
			c=scan.nextInt();
			if(c>0 && c<=100)
				break;
		}
		while(true)
		{
			System.out.println("Enter a cpp Marks:");
			cpp=scan.nextInt();
			if(cpp>0 && cpp<=100)
				break;
		}
		while(true)
		{
			System.out.println("Enter a python Marks:");
			py=scan.nextInt();
			if(py >0 && py<=100)
				break;
		}
		while(true)
		{
			System.out.println("Enter .Net Marks:");
			net=scan.nextInt();
			if(net>0 && net<=100)
				break;
		}
		total_marks=j_m+cpp+py+net+c;
	    percent= total_marks/5.0f;
	    
	    if((j_m<35)||(cpp<35)||(c<35)||(py<35)||(net<35))
	    	grade="Fail";

	    else if((total_marks>=375)&& (total_marks<=500))
	    	grade="Distinction";

	    else if((total_marks>300) && (total_marks<=374))
	    	grade="First Class";

	    else if((total_marks>=250)&&(total_marks<=299))
	    	grade="Second Class";

	    else if((total_marks>=175)&&(total_marks<=249))
	    	grade="Third Class";

	    
	    
//	   Display The Marks Report
	    System.out.println("***** Student Report *****");
	    System.out.println("Student Roll No:"+r_no);
	    System.out.println("Student Name:"+name);
	    System.out.println("__________________________");
	    System.out.println("C Programming Marks:"+c);
	    System.out.println("Java Programming Marks:"+j_m);
	    System.out.println("C++ Programming Marks:"+cpp);
	    System.out.println("Python Programming Marks:"+py);
	    System.out.println(".Net Programming Marks:"+net);
	    System.out.println("__________________________");
	    System.out.println("Total Marks:"+total_marks);
	    System.out.println("Percentage:"+percent+"%");
	    System.out.println("Grades:"+grade);
		
	}
}