import java.util.*;
class Ra
{
	public static void main(String[]args)
	{
		int a[]={1,2,3,4,5,7,8};
		int b[]={2,4,2,3,2,7,5};
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==b[j])
				{
					c++;
				}
			}
			if(c>0)
			{
			System.out.println(a[i]+"="+c);
			}
			c=0;
		}
		String s1="arun";
		String s2="java";
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					c++;
				}
			}
			if(c>0)
			{
			System.out.println(s1.charAt(i)+"="+c);
			}
			c=0;
	}
}}