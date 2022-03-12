package Day4;

public class MethodOverloading 
{
	public static void main(String[] args) 
	{	
		m1("Kumendra",9637,1996);
//		m1("Kumendra",9049727490,2022,1200);
	}
	public static void m1(String name,long no,int age)
	{
		System.out.println("______Biodata_____");
		System.out.println("The name is:"+name);
		System.out.println("The Mbile No is:"+no);
		System.out.println("The age is:"+age);
//		System.out.println("The best No is :"+i);
	}
//	public void m1(String name,long no,int age)
}
