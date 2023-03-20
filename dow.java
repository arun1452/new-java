import java.util.*;
class dow
{
public static void main(String[]ars)
{
	Scanner x=new Scanner(System.in);
	System.out.println("enter the value");
	String a=x.next();
		
	
	int c=0;
	for(int i=0;i<a.length();i++)
	{
	
	if(a.charAt(i)==' ')
	{
			c++;
	}}
	
		int d=a.length()-c;
	System.out.println(d);
}
}