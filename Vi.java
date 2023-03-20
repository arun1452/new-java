import java.util.*;
class Vi
{
	public static void main(String[]args)
	{
		StringBuffer sb=new StringBuffer();
		sb.append("java");
		sb.append("android");
		sb.append("python");
		System.out.println(sb);
		Scanner x=new Scanner(System.in);
		System.out.println("enter");
		String a=x.next();
		int b,c;
		 c=a.length();
		 b=sb.indexOf(a);
		sb.delete(b,(b+c));
		System.out.println(sb);	
		
	}
}