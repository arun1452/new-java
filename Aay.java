import java.util.*;
class Aay
{
	public static void  main(String[]args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the employe counter");
		int a=s.nextInt();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<a;i++)
		{
			String s1=s.next();
			al.add(s1);
		}
		
		
		System.out.println(al);
	}
}