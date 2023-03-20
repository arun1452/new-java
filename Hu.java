import java.util.*;
class Hu
{
public static void main(String[]args)
{
	Scanner x=new Scanner(System.in);
	System.out.println("Enter mark");
	int b=x.nextInt();
	System.out.println("mark2");
	int c=x.nextInt();
	System.out.println("mark3");
	int d=x.nextInt();
	System.out.println("mark4");
	int e=x.nextInt();
	System.out.println("mark5");
	int f=x.nextInt();
	A n=new A(b,c,d,e,f);
	n.setTotal();
	n.setAvg();
	n.setResult();
	n.setGrade();
	int i=n.getTotal();
	int j=n.getAvg();
	String k=n.getResult();
	String l=n.getGrade();
	System.out.println("total"+i);
	System.out.println("avg"+j);
	System.out.println("result"+k);
	System.out.println("grade"+l);
	
}}
class A
{
	private int m1,m2,m3,m4,m5;
	private int total;
	private int avg;
	private String result;
	private String grade;
	
	
A(int m1,int m2,int m3,int m4,int m5)
{
	
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.m4=m4;
	this.m5=m5;
	
}
public void setTotal()
{
	total=m1+m2+m3+m4+m5;
	 
}
public void setAvg()
{
	avg=total/5;
	
	
}
public void setResult()
{
	int c=0;
	
	
	if(m1>=35)
	{
		c++;
	
	}
	if(m2>=35)
	{
		c++;
	}
	if(m3>=35)
	{
		c++;
	}
	if(m4>=35)
	{
		c++;
	}
	if(m5>=35)
	{
		c++;
	}
	if(c==5)
	{
		result="pass";
	}
	else{
		result="fail";
	}
	System.out.println("pass:"+c);
	System.out.println("fail:"+(5-c));
}
public void setGrade()
{
	
	if(result.equals("pass"))
	{	
	if(avg>80&&avg<100)
	{
		grade="A";
	}
	else if(avg>60&&avg<80)
	{
		grade="B";
	}
	else if(avg>50&&avg<60)
	{
		grade="c";
	}
	else if(avg>36&&avg<50)
	{
		grade="d";
	}
	else
	{
		grade="invaliud";
	}}
	else
	{		
		grade="U";
	
}
}
public  int getTotal()
{
	return total;
}
public int getAvg()
{
	return avg;
}
public String getResult()
{
	return result;
}
public String getGrade()
{
	return grade;
}
}

	
	
	