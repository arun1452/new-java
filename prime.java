import java.util.Scanner;
class prime
{
public static void main(String []args)
{
	Scanner x=new Scanner(System.in);
	System.out.println("a");
	int a=x.nextInt();
	for(int i=2;i<=a/2;i++)
	{
	if(i%2==0)
	{
	System.out.println(i);
	}
	}
}
}	