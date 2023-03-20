import java.util.*;
class Sw
{
	public static void main (String[]args)
	{		int c1=0,c2=0,c3=0,c4=0,c5=0;
		Scanner x=new Scanner(System.in);
		System.out.println("enter the ");
		String a=x.next();
		int c=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			 ch=a.charAt(i);
			switch(ch)
			{
				case 'a':
				c1++;
				case 'e':
				c2++;
				case 'i':
				c++;
				case 'o':
				c++;
				case 'u':
				c++;
				System.out.println(ch);
				break;
		}}
		if(c==0)
		{System.out.println("no vowels");
		}
		else
		{
			System.out.println("vowels:"+c);
		}
	}
}
				