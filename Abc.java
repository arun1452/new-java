import java.util.*;
class Abc
{
	public static void main(String[]args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter a no.:");
		int a = scanner.nextInt();
		int b=0,result=0;
		while(a>0)
		{
			b =a%10;
			a=a/10;
			result=result+b;
		}
		System.out.println("total :"+result);
	}
}