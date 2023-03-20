import  java.util.*;
class T
{
	String name="Arun";
	int password=123456;
	public static void main(String[]args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the name :");
		String y=x.next();
		System.out.println("Enter the password :");
		int r=x.nextInt();
		T n=new T();
		
		if(y.equals(n.name)&&r==n.password)
		{
		System.out.println("it a correct");
		}
	else
	{
	System.out.println("Not match");
		}
		
		
		
		
		
	}
}