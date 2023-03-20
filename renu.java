import java.util.*;
class renu
{
public static void main(String[]args)
{
	h n=new h();
	h n1=new h();
	h n2=new h();
	n.start();
	try{n.join();}
	catch(Exception e)
	{
		System.out.println(e);
	}
	n1.start();
	n2.start();
	
	
	
}
}
class h extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println();
		}
			System.out.println("arun"+i);
			
		}
	}
}