import java.util.*;
class To
{
	public static void main(String[]args) throws nameException,paswordExeception,numberException,emailException
	{
		To n=new To();
		try
		{
			n.a();
		}
		catch(nameException i)
		{
			System.out.println(i.getMessage());
		}
		catch(paswordExeception i1)
		{
			System.out.println(i1.getMessage());
		}
		catch(numberException i2)
		{
			System.out.println(i2.getMessage());
		}
		catch(emailException i3)
		{
			System.out.println(i3.getMessage());
		}
	}
		
	public void a()throws nameException,paswordExeception,numberException,emailException
	{	
		Scanner x=new Scanner(System.in);
		System.out.println("enter the user name");
		String a=x.next();
		String name=a.toUpperCase();
		if(a.equals(name))
		{
			
		}
		else
		{
			throw new nameException("give capital letter");
		}
		System.out.println("enter the pasword");
		String b=x.next();
		String pas=b.toUpperCase();
		if(b.length()>8&&b.charAt(0)==pas.charAt(0))
		{
			
		}
		else
		{
			throw new paswordExeception("give 8 digit vaues");
		}
		System.out.println("enter the number");
		String d=x.next();
		if(d.length()!=10||d.equals(""))
		{
			throw new numberException("invalid mobile number");
		}
		else
		{
		}
		System.out.println("enter email id");
		String f=x.next();
		if(f.contains("@")||f.contains(".com"))
		{
			System.out.println();
		}
		else
		{
			throw new emailException("correct email to give @ and .com");
		}
		
	}
}
class  nameException extends Exception
{
	nameException(String s)
	{
		super(s);
	}
}
class paswordExeception extends Exception
{
	paswordExeception(String o)
	{
		super(o);
	}
}
class numberException extends Exception
{
numberException(String a1)
{
super(a1);
}
}
class emailException extends Exception
{
emailException(String  a2)
{
super(a2);
}
}	
		