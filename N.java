import java.util.*;
class N
{
	static String l_Name=" ";
	static String l_Password="";
	static String R_name="";
	static String R_password="";
	static String R_cpasswor="";
	public static void main(String[]args)
	{
		System.out.println("1 l0gin\n 2.Register");
	Scanner x=new Scanner(System.in);

	int a=x.nextInt();
	

	if(a==1)
	{
	Login();
	}
	else if(a==2)
	{
	Register();
	
	}
	else{
		System.out.println("invalid");
	}
	}
		
		
	public static void Login()
	{
	
	Scanner x=new Scanner(System.in);
	System.out.println("Ente lName");
	String l_Name=x.next();
	System.out.println("Enter lPassword");
	String l_Password=x.next();
	if(l_Password.equals(R_password))
	{
	System.out.println("sucess");
	}
	else
	{
		System.out.println("invalid");
	}
	}
	public static void Register()
	{
		Scanner x=new Scanner(System.in);
	System.out.println("Ente rname");
	String R_name=x.next();
	System.out.println("Ente rpassword");
	String R_password=x.next();
	System.out.println("Ente rcpassword");
	String R_cpassword=x.next();
	
	if(R_password.equals(R_cpassword))
	{
		Login();
	}
else
{
System.out.println("envalid");
}
	}
}	
	
	
	
	
	
	
	