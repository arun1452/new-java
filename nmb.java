import java.util.*;
class nmb
{
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String a[]=s1.split(" ");
	int c=0;
	LinkedHashMap<String,Integer>b=new LinkedHashMap<>();
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i].equals(a[j]))
			{
				c++;
			}
		
		b.put(a[i],c);
		
	}
	
	c=0;
	}
	System.out.print(b);
	
	
}
}

	