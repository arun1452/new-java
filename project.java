import java.util.*;
class project
{
	public void Login()
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter the user name");
		String un=x.next();
		System.out.println("enter the pasword");
		String up=x.next();
		if(up.equals(rpassword))
		{
			System.out.println("enter the 1:staff/2:student");
			int a=x.nextInt();
			if(a==1)
			{
				staff();
			}
			else if(a==2)
			{
				student();
			}
			else
			{
				System.out.println("unvalid");
			}
		}
		else
		{
			System.out.println("please first you register");
		}
	}
	public void Rigesters()
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enetr the register name");
		String rname=x.next();
		System.out.println("enter the rigesterpasword");
		String rpassword=x.next();
		System.out.println("enter the confrim rigesterpasword");
		String crpassword=x.next();
		
		System.out.println("enter the moblie number");
		long moblie=x.nextLong();
		if(rpassword.equals(crpassword))
		{
			Login();
		}
		else
		{
			System.out.println("please enter corect pasword");
		}
	}
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
		Scanner x=new Scanner(System.in);
		System.out.println("enter the name");
		String c=x.next();
		System.out.println("Enter the pasword");
		String d=x.next();
		if(c.equals(rname)&&d.equals(rigesterpasword))
		{
			showbook();
		}
		else
		{
			System.out.println("Eneter correct one");
		}
	}
	public void addBook()
	{
		ArrayList<String> r=new ArrayList<>();
		r.add("java");
		r.add("python");
		r.add("c++");
		r.add("cloud");
		r.add("xml");
		r.add("html");
		System.out.println("the books"+ r);
			//Scanner x=new Scanner(System.in);
			//System.out.println("enter the books to add");
			//String  a=x.next();
			//ArrayList<String> a=new ArrayList<>(); 
	}
	public void showbook()
	{
	}
	public static void main(String[]args)
	{
		project z=new project();
		z.Login();
		z.Rigesters();
		z.staff();
		z.student();
		z.addBook();
		z.showbook();
	}
}

