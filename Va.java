class Va
{
	public  static void main(String[]args)
	{
		int a[]={10,20,30,40};
		int b[]={20,50,70,80};
		int c[]=new int[a.length];
		for(int  i=0;i<a.length;i++)
			{
				c[i]=a[i]+b[i];
				System.out.println("c["+i+"]="+c[i]);
	}}
}