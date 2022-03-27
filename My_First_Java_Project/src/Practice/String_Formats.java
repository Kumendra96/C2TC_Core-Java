package Practice;

public class String_Formats 
{
	public static void main(String[] args)
	{
		String name ="Khumen";
		System.out.println(name);
		int value =name.length();
		System.out.println(value);
		String lstr=name.toLowerCase();
		System.out.println(lstr);
		String ustr=name.toUpperCase();
		System.out.println(ustr);
		String str="      Khumen      ";
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(name.substring(3,5));
		System.out.println(name.replace("Khumen", "kumendra"));
		System.out.println(name.replace("men", "ndra"));
		System.out.println(name.startsWith("hu"));
		System.out.println(name.endsWith("men"));
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("n"));
		System.out.println(name.indexOf(9));
		System.out.println(name.lastIndexOf(5));
		System.out.println(name.lastIndexOf("u",5));
		System.out.println(name.equals("khumen"));
		System.out.println(name.equalsIgnoreCase("KhUmEn"));
		System.out.println("I am escame sequence\"hello\"");
	}
} 