import  java.util.*;
class Ww
{
	public static void main(String[]ars)
	{	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the");
	String a=s.next();
	int b=a.length();
	for(int i=b-1;i>=0;i--)
	{
		System.out.println(a.charAt(i));
	}
	}
}