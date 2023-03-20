import java.util.*;
class W
{
	public static void main (String [] args)
	{
	Scanner x=new Scanner(System.in);
	System.out.println("enter the limites");
	int a=x.nextInt();
	for (int i=1;i<=a;i++)
	{
		if(i%2==0)
		{
		System.out.println("it is a even number"+i);
		}
		else if(i%2!=0)
		{
		System.out.println("it is odd number"+i);
		}
		else
		{
		System.out.println("it not even");
		}
	}
	}
}	