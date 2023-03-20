import java.util.*;
class diff
{
public static void main(String[]args)
{
	r x=new r();
	r1 x1=new r1();
	r2 x2=new r2();
	x.start();
	x1.start();
	try{
		
	x1.join();
	}
	catch(Exception e)
	{
		System.out.println();
	}
	
	x2.start();





}


}
class r extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println();
}	
System.out.println(i);	
}}}
class r1 extends Thread
{
	public void run()
{
for(int i=0;i<=5;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println();
}	
System.out.println(i);	
}}}
class r2 extends Thread
{
	public void run()
{
for(int i=0;i<=5;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println();
}	
System.out.println(i);}	
}
}