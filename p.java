import java.util.*;
class p
{
public static void main(String []args)
{
	Scanner x=new Scanner(System.in);
	System.out.println("Enetr the limits a:");
	int a=x.nextInt();
	
	for(int i=1;i<=a;i++)
	{int c=0;
	for(int j=1;j<=i;j++)
	{
	if(i%j==0)
	{
	c++;
	}
	}
	if(c==2)
	{
		System.out.println("prime no"+i);
	}
	
	
	}
	}

}