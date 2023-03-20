import java.util.*;
class Ecr
{
	public static void main(String[]args)
	{
	String s1="Java";
	String r=s1.toLowerCase();
	String s2="avja";
	char []c=r.toCharArray();
	char []c1=s2.toCharArray();
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(c1));
	Arrays.sort(c);
	Arrays.sort(c1);
	String n=new String(c);
	String n1=new String(c1);
	System.out.println(n);
	System.out.println(n1);
	System.out.println();
	System.out.println(n.equals(n1));
	}
}
	