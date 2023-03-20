import java.util.*;
class Hii
{
	int add()
	{
   System.out.println();
		
	
		return(9);
	}
	int add(int a)
	{
		System.out.println("enter alue"+a);
		return(a);
	}
	int add(int a,int b)
	{
		
		int c=a+b;
			System.out.println("enter value"+c);
		return(c);
	}
	int add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("enter the value"+d);
	
	return(d);
	}
	int add(int a,int b,int c,int d)
	{
		int e=a+b+c+d;
		System.out.println("enter the value"+e);
		
		return(e);
	}
	int add(int a,int b,int c,int d,int e)
	{
		int f=a+b+c+d+e;
		System.out.println("enter the value"+f);
		
		return(f);
	}
	public static void main(String[]args)
	{
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("arguments"+i);
		}
		Scanner y=new Scanner(System.in);
		System.out.println("enter your option");
		int z=y.nextInt();
		Hii n=new Hii();
		if(z==0)
		{
			System.out.println("enter the value");
			n.add(9);
		}
		if(z==1)
		{
			System.out.println("enter the value");
			int n1=y.nextInt();
		n.add(n1);
		}
		else if(z==2)
		{
			System.out.println("enter the value");
			int n1=y.nextInt();
			int n2=y.nextInt();
			
			n.add(n1,n2);
		}
		else if(z==3)
		{
		System.out.println("enter the value");
			int n1=y.nextInt();
			int n2=y.nextInt();
			int n3=y.nextInt();
			
			n.add(n1,n2,n3);
		}
		else if(z==4)
		{
			System.out.println("enter the value");
			int n1=y.nextInt();
			int n2=y.nextInt();
			int n3=y.nextInt();
			int n4=y.nextInt();
			
			n.add(n1,n2,n3,n4);
		}
		else if(z==5)
		{
			System.out.println("enter the value");
			int n1=y.nextInt();
			int n2=y.nextInt();
			int n3=y.nextInt();
			int n4=y.nextInt();
			int n5=y.nextInt();
			n.add(n1,n2,n3,n4,n5);
		}
		else
		{
			System.out.println("envalid");
		}
		
		
	}
}
		
		
		
		
		
	

		
		


		