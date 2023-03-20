import java.util.*;
class vibe
{
	public static void main(String[]args)
	{
		
	vibe v=new vibe();
	v.add();
		
	}
	public void add()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value");
	int a=s.nextInt();
	System.out.println("enter the value");
	int b=s.nextInt();
		
	try{
		int c=a/b;
		System.out.println(c);
		
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	
	if(c<0)
	{
	System.out.println(e);
	}
	else
	{
		add();
	}}
}