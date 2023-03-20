class un
{
	public static void main(String[]args)
	{
	un x=new un();
	b c=new b(x);
	
	
	}
	public void add()
	{
		System.out.println("add");
	}
	
	public void sub()
	{
		System.out.println("sub");
	}
	
	public void mul()
	{
		System.out.println("mul");
	}
}
class b
{
	b(un x)
	{
		x.add();
	x.sub();
	x.mul();
		System.out.println("b");
	}
	
	
	
}