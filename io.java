class io
{
	public static void main(String[]args)
	{
		int n=sum(5);
		System.out.println(n);
		
		
		
	}
	public static int sum(int k)
	{
		if(k>0)
		{
			return k+sum(k-1);
		}
		else
		{
			return 0;
		}
	}
}