import java.util.*;
class La
{
	public static void main (String[]args)
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter the ");
		String a=x.next();
		int c1=0,c2=0,c3=0,c4=0,c5=0;
		for(int i=0;i<=a.length()-1;i++)
		{
		if(a.charAt(i)=='a'||a.charAt(i)=='A')
		{
			c1++;
		}
		if(a.charAt(i)=='e'||a.charAt(i)=='E')
		{
			c2++;
		}
		if(a.charAt(i)=='i'||a.charAt(i)=='I')
		{
			c3++;
		}
		if(a.charAt(i)=='o'||a.charAt(i)=='O')
		{
			c4++;
		}
		if(a.charAt(i)=='u'||a.charAt(i)=='U')
		{
			c5++;
		}
		}
		System.out.println("a:"+c1);
		System.out.println("e:"+c2);
		System.out.println("i:"+c3);
		System.out.println("o:"+c4);
		System.out.println("u:"+c5);
			}
}