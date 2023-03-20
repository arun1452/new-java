import java.util.Scanner;
class loop
{
public static void main(String [] args)
{
	Scanner x=new Scanner(System.in);
	System.out.println("enter the i ;");
	int a=x.nextInt();
	
	
	for(int i=1;i<=10;++i)
	{
		int c=i*a;
	System.out.println(i+"*"+a+"="+c);
	}
}
}	
	
	