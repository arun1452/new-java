import java.util.*;
class ha
{
	public static void main(String[]args) throws ArithmeticException
	{
	ha y=new ha();
	try{
		y.add();
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	
		
	}
	public void add() throws ArithmeticException
	{
		int  a=10;
		int b=0;
		int c=a/b;
		throw new ArithmeticException("the eror");
		
	}
}