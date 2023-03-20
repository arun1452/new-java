import java.util.*;
class poi
{
public static void main (String[]args)
{
	t a=new t();
	t1 b=new t1();
	t2 c=new t2();
	a.start();
	try{
		a.join();
	}
	catch(Exception e)
	{System.out.println(e);
	}
	b.start();
	c.start();
	
	
	
	
}
}
class t extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("arun"+ i);
			try{
			Thread.sleep(1000);}
			catch(Exception e)
			{
				System.out.println();
			}
		}
	}
}
class t1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			
			System.out.println("java"+ i);
			try{
				
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println();
			}
		}
	}
}
class t2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("python"+ i);
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println();
			}
			
		}
	}
}