import java.util.*;
class ja
{
	public static void main(String[]args)
	{
		ja j=new ja();
		try{
			j.name();
		}
		catch(limitedException e)
		{
			System.out.println(e);
		}
		try{
			j.password();
		}
		catch(pwworngException e)
		{
			System.out.println(e);
		}
		try{
			j.email();
		}
		catch(emailException e)
		{
			System.out.println(e);
		}
		
		
	}
	public void name()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String a=s.next();
		if(a.length()<20)
		{
			throw new limitedException("limitedException");
		}
		else
		{
			System.out.println();
		}
	}
	public void pasword()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the password");
		String b=s.next();
		if(b.charAt(0).equals(upperCase))
		{
			System.out.println("correct");
		}
		else
		{
			throw new  pwworngException("startcapital");
		}
	}
	public void email()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the email");
		String c=s.next();
		if(c.contains('@'))
		{
			System.out.println("ok");
		}
		else
		{
			throw new  emailException("please enter @");
			
		}
	}
}
		
class limitedException extends Exception
{
	limitedException(String s)
	{
		super(s);
	}
}
class pwworngException extends Exception
{
	pwworngException(String s)
	{
		super(s);
	}
}
class emailException extends Exception
{
	emailException(String s)
	{
		super(s);
	}
}