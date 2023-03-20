import java.util.*;
class m
{
public static void main(String[]args)
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the limits");
		int a=n.nextInt();
		int sumeven=0,sumodd=0;
		for(int i=1;i<=a;i++)
		{
			System.out.println("Enter the value"+i);
		int j=n.nextInt();
		
		if(i%2==0)
		{
			sumeven=sumeven+j;
			}
		if((i%2)!=0)
		{
			sumodd=sumodd+j;
		}}
		System.out.println("enter total "+sumeven);
		
		
		System.out.println("enter total "+sumodd);
		
	}
}