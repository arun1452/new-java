import java.util.*;
class food
{
	public static void main(String[]args)throws invaidRange
	{
		food b=new food();
		try
		{
		b.add();
		}
		catch(Exception n)
		{
			System.out.println(n.getMessage());
		}
		
		
		
	}
	public void add()throws invaidRange
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter the vaue");
		int a=x.nextInt();
		if(a<25)
		{
			throw new invaidRange("the error");
			
		}
		else
		{
		System.out.println("invalid");
		}
	}
}
class invaidRange extends Exception
{
invaidRange(String e)
{
super(e);	
}	
}