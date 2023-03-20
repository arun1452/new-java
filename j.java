class j
{
	public static void main(String[]args)
	{
	int a=6;
	boolean f=true;
	for (int i=2;i<=a/2;i++)
	if(a%i==0)
	{
	f=false;
	break;
	}
	
	if(f)
		System.out.println("prime no"+a);
	else	
		System.out.println("non prime no");
	}
}	