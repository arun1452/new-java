import java.util.*;
class rrr
{
	public static void main(String[]ars)
	
	{
		Scanner x=new Scanner(System.in);
		
		System.out.println("enter the value");
		int a=x.nextInt();
		
		
		int b=0;
        
		
		
		
        if(a%2==0){
			System.out.println("even number"+a);
		}		
		else
		{System.out.println("odd number"+a);}
		
	for(int i=2;i<a;i++){
		if(a%i==0){
			b++;
	}
		if(b>0)
		{System.out.println("not a prime number");}
	    else
		{System.out.println("prime number" +a);}
	
	
	}
	
	
	if(a>0)
		{System.out.println("positive value"+a);}
	    else
		{System.out.println("negative value" +a);}
	
	
	
}
}