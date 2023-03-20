class sur
{
	public static void main(String[]args)
	{
		int a=100;
		int c=0;
		int d=0;
		int b=0;
		int f=0;
		
		
		for(int j=1;j<=a;j++)
			{
				if(j%2==0)
				{
					c++;
				}
			 if(j%10==0)
				{
				d++;
				}
				 if(j%50==0)
				{
				b++;
				}
				 if(j%100==0)
				{
				f++;	
				}
				
				
			}
			System.out.println("no 2:"+c);
			System.out.println("no 10:"+d);
			System.out.println("no 50:"+b);
			System.out.println("no 100:"+f);
		
	}
}