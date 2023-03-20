import java.util.*;
class E
{
	public  static void main(String[]args)
	{
		int a[]={10,20,30,40};
		int b[]=new int[a.length];
		int i,j;
		for(j=0;j<a.length-1;j++)
		{
			System.out.println(a[j]);
			
		}
		
		for(i=a.length-1;i>=0;i--)
		{
			b[i]=a[j];
		}
		
				System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		
	}
}
