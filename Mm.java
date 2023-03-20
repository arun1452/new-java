abstract class A
{
	abstract int add(int a,int b);
	abstract void sub(int a,int b);
	void mul()
	{
		System.out.println("mul");
	}
}
class Mm extends A
{
	public static void main(String[]arg)
	{
	Mm x=new Mm();
	int n=x.add(10,5);
		x.sub(10,5);
		x.mul();
		x.div();
		System.out.println(n);
		
	}
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	void div()
	{
		System.out.println("div");
	}
}
	
	
	
	
	