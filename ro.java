import java.util.*;
class ro
{
public static void main(String[]args)
{
	ArrayList x=new ArrayList(); 
	x.add(4);
	x.add(9);
	x.add(8);
System.out.println(x);
	ArrayList y=new ArrayList<>(x);
	
	System.out.println(y);
	
}
}