import java.util.*;
class Rr
{
	public static void main(String[]ars)
	
	{
		Scanner x=new Scanner(System.in);
	System.out.println("Ente no 1");
	int a=x.nextInt();
	System.out.println("Enter the no 2");
	int b=x.nextInt();
	int c=a+b;
	System.out.println("Result"+c);
	
	
	
		System.out.println("do you want ?(yes/no)");
		
		
	String go=x.next();
	
	if(go.equals("yes"))
	{
		do
		{
			
		
	System.out.println("Ente no 1");
	 a=x.nextInt();
	System.out.println("Enter the no 2");
	 b=x.nextInt();
	 c=a+b;
	System.out.println("Result"+c);
	System.out.println("do you want ?(yes/no)");
		go=x.next();
		
		}		
	while(go.equals("yes"));
		}
}}
