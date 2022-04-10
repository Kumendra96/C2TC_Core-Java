package practices;
import java.util.Scanner;
public class ArmstrongNo
{
	public static void main(String[] args) 
	{
		int i=0,res=0,n,num,temp;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Number:");
		int no = scan.nextInt();
		num=no;
		temp= no;
		while(no!=0)
		{
			no=no/10;
			i++;
		}
		while(num !=0)
		{
			n=num%10;
			res=res+(int)Math.pow(n,i);
			num=num/10;
		}
		if(temp==res)
			System.out.println(res+"number is armstrong:");
		else
			System.out.println(res+"number is not armstrog:");
		scan.close();
	}
}