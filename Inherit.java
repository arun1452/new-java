class Parent
{
	public void n()
	{
	System.out.println("this is parent class");
	}
}
class	child extends Parent
{
	public void r()
	{
	System.out.println("this is child class");
	}
}
class Inherit
{
	public static void main(String[]args)
	{
	
	Parent a=new Parent();
	child b=new child();
	b.r();
	b.n();
	a.n();
	}
}

	
