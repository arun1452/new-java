import java.util.*;
class product
{
public static void main (String[]args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the 1:showproduct/ 2:purchase");
	int a=s.nextInt();
	if(a==1)
	{
		showproduct();
		
	}
	if(a==2)
	{
		purchase();
	}
	else
	{
		System.out.println();
	}
	
}
public static void showproduct()
{
	ArrayList<String> ar=new ArrayList<>();
	ar.add("mobile");
	ar.add("watch");
	ar.add("iphone");
	ar.add("laptop");
	
	ArrayList<Integer> b=new ArrayList<>();
	b.add(15);
	b.add(25);
	b.add(10);
	b.add(18);
	
	ArrayList<Integer> amt=new ArrayList<>();
	amt.add(10000);
	amt.add(500);
	amt.add(100000);
	amt.add(20000);
	System.out.println("product,quantity,amount");
	for(int i=0;i<=3;i++)
	{
		System.out.println(ar.get(i)+"  "+b.get(i)+" "+amt.get(i));
		
	}
	Scanner s=new Scanner(System.in);
	System.out.println("enter the 1:showproduct/ 2:purchase");
	int a=s.nextInt();
	if(a==1)
	{
		showproduct();
		
	}
	if(a==2)
	{
		purchase();
	}
	else
	{
		System.out.println();
	}
	
	
}
public static void purchase()
{
	
	ArrayList<String> ar=new ArrayList<>();
	ar.add("mobile");
	ar.add("watch");
	ar.add("bike");
	ar.add("laptop");
	
	ArrayList<Integer> b=new ArrayList<>();
	b.add(15);
	b.add(25);
	b.add(10);
	b.add(18);
	
	ArrayList<Integer> amt=new ArrayList<>();
	amt.add(10000);
	amt.add(500);
	amt.add(100000);
	amt.add(20000);
	System.out.println("product,quantity,amount");
	for(int i=0;i<=3;i++)
	{
		System.out.println(ar.get(i)+"  "+b.get(i)+" "+amt.get(i));
	}
	Scanner x=new Scanner(System.in);
	System.out.println("enter product name");
	String p=x.next();
	System.out.println("enter product quantity");
	int q=x.nextInt();
	System.out.println("do you want purchase continue yes/no");
	String s=x.next();
	int c=0;int y=0;
	for(int i=0;i<ar.size();i++)
	{
		
	if(p.equals(ar.get(i)))
	{
		System.out.println(ar.get(i)+"  "+b.get(i)+" "+amt.get(i));
	}
	
	if(s.equals("yes"))
	{
		
		
		c=b.get(i);
		y=i;
		b.set(y,(c-i));
	}
		
	
	else
	{
		System.out.println("please give the reson");
	}
	}
	for(int i=0;i<ar.size();i++)
	{
		System.out.println(ar.get(i)+"  "+b.get(i)+" "+amt.get(i));
	}
}

	
	

}
		