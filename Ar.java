import java.util.*;
class Ar
{
	public static void main(String[]args)
	{
		int a[]={10,20,30,40,50,60,70,80,90};
		
		Scanner x=new Scanner(System.in);
		System.out.println("enter thevalue");
		int c=x.nextInt();
		int b=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]==c)
		{
			b++;
		}}
		if(b>0)
		{	
		
			System.out.println("sucesss");
		}
		else
		{
			System.out.println("not a sucesss");
			
		}
		
	}
}
		