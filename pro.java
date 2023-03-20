import.java.util.*;
class pro
{
	public void staff()
	{
		String a="raj";
		String b="23456";
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the name");
		String sname=x.next();
		System.out.println("enter the pasword");
		String spasword=x.next();
		if(a.equals(sname)&&b.equals(spasword))
		{
			addBook();
		}
		else
		{System.out.println("please correct data");
		}
	}
	public void student()
	{
		s