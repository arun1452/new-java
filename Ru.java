import java.util.*;
class Ru
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	
	int n[]={1,2,3,4};
	String x="";
	try{
		
	int c=a/b;
	System.out.println(c);
	System.out.println(x.charAt(7));
	System.out.println(n[0]);
	
	
	}
	catch(ArithmeticException e)
	{
		System.out.println(e+"plase enter valid input");
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
		System.out.println(e1+"plase enter valid input");
	}
	catch(NullPointerException e2)
	{
		System.out.println(e2+"no data");
	}
	catch(Exception e)
	{
		System.out.println(e+"plase enter valid input");
	}
	
	finally
	{
		int d=a+b;
		System.out.println(d);
	}
	
}}