import java.util.*;
class Ta
{
	public static void main(String[]args)
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter name");
		String a=n.next();
		System.out.println("Enter Amount");
		int b=n.nextInt();
		System.out.println("Enter quntity");
		int c=n.nextInt();
		A x=new A();
		x.setName(a);
		x.setAmt(b);
		x.setQnty(c);
		String r=x.getName();
		int s=x.getAmt();
		int d=x.getQnty();
		int h=x.total(b,c);
		
		System.out.println(h);
	}
}
class A
{
	private String productname;
	private int amt;
	private int qnty;
	private int total;
	
	public void setName(String name)
	{
		 String productname=name;
	}
	public void setAmt(int a)
	{
		amt=a;
	}
	public void setQnty(int q)
	{
		qnty=q;
	}

	public String getName()
	{
		return productname;
	}
	public int getAmt()
	{
		return amt;
	}
	public int getQnty()
	{
		return qnty;
	}
	public  int total(int amt,int qnty)
	{
		total=amt*qnty;
		return total;
	}
}
		
		