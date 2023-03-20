import java.util.*;
class Aa
{
	public static void main(String[]args)
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the limits");
		int a=n.nextInt();
		
		for(int i=1;i<=a;i++)
		{

			if((i%2)!=0)
			{
				i=i+2;
				System.out.println(i);
				
			}
		}
		
	}
}
