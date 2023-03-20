import java.util.*;
class lo
{
	public static void main(String[]args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter a:");
		int a=x.nextInt();
		System.out.println("enter b:");
		int b=x.nextInt();
		System.out.println("enter c:");
		int c=x.nextInt();
		
		if(a<=b)
		{
			for(int i=a;i<=b;i++)
			{
			System.out.println(i);
			}
			System.out.println();
			
			 if(c<b-a)
			{
				for(int j=b;j>b-a;j--)
				{
			System.out.println(j);
			}}
			
			
	}}
}