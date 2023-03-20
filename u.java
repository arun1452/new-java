import java.util.*;
class U
{
	public static void main (String[]arg)
	{
	
	String a[]=new String[5];
	for(int i=0;i<=4;i++)
	{
		Scanner x=new Scanner(System.in);
			System.out.println("enter the value");	
			
		a[i]=x.next();	
		}
	for(int i=0;i<=4;i++)
	{		
		System.out.println(a[i]);
	}
	}
}