package practices;
import java.util.*;
public class Palindrome
{
	public static void main(String[] args) 
	{
		int var,r,reverseNum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:");
		int orignalNum=scan.nextInt();
		var=orignalNum;
		while(var!=0)
		{
			r=var%10;
			reverseNum=reverseNum*10+r;
			var/=10;
		}
		if(orignalNum==reverseNum)
			System.out.println("Number is pallindrome:");
		else
			System.out.println("Number is not pallindrome:");
		scan.close();
	}
}