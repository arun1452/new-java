class App
{
	public static void main(String[]args)
	{
	Encap a=new Encap();
	a.setName("arun");
	a.setmark(77);
	a.getname();
	a.getMark();
	String n=a.getname();
	int x=a.getMark();
	System.out.println(n+"  "+x);
		
		
	}
}
class Encap
{
	private String name;
	private int mark;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setmark(int m)
	{
		mark=m;
	}
	public String getname()
	{
		return name;
	}
	public int getMark()
	{
		return mark;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		