import java.util.*;

class X
{
	public static void main(String[]args)
	{
		String s="Java is a widely used object-oriented programming language and software platform that runs on billions of devices"; 
		String s1="java";
		String s2="java";
		String s3="Rajesh";
		String s4="Arun";
		
		String s5="                 Android                 ";
		
		String a="arun";
		String b="Arun";
		
		
		System.out.println();
		//length method//
		System.out.println("length:"+s.length());
		System.out.println();
		//charAt method//
		System.out.println("charAt method:"+s.charAt(100));
		System.out.println();
		//equal method//
		System.out.println("equal:"+s1.equals(s2));
		System.out.println();
		//compare tomethod//
		System.out.println("compare:"+s3.compareTo(s4));
		System.out.println(s4.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println();
		//index method//
		System.out.println("indexof charAt:"+s.indexOf('o'));
		System.out.println("indexof String:"+s.indexOf("run"));
		System.out.println("indexof charAt:"+s.lastIndexOf('e'));
		System.out.println();
		//substring method//
		System.out.println("substring:"+s.substring(50));
		System.out.println();
		//concast  method//
		System.out.println("concast:"+s1.concat(s2));
		System.out.println();
		//relace method//
		System.out.println("replace"+s.replace("run","go"));
		System.out.println();
		//uppercase method//
		System.out.println("uppercase:"+s4.toUpperCase());
		System.out.println();
		//lowercase method//
		System.out.println("lowercase:"+s3.toLowerCase());
		System.out.println();
		//trim method//
		System.out.println("trim:"+s5.trim());
		System.out.println();
		//starwith method//
		System.out.println("starwith:"+s.startsWith("Java"));
		System.out.println();
		//endwith method//
		System.out.println("endwith:"+s.endsWith("java"));
		System.out.println();
		//value method//
		int n=80;
		String n1=String.valueOf(n);
		System.out.println("value:"+(n1+80));
		System.out.println();
		//equalignore//
		System.out.println("equalignore:"+a.equalsIgnoreCase(b));
		System.out.println();
		//getchar method//
		char[]ch1=new char[36];
		String c="Android is a mobile operation system";
		c.getChars(0,36,ch1,0);
		System.out.println("getChar"+Arrays.toString(ch1));
		System.out.println();
		//string to array char//
		String y="Python";
		char[] ch=y.toCharArray();
		System.out.println("string :"+y+"to array:"+Arrays.toString(ch));
		System.out.println();
		//arrayto string//
		String sk=new String(ch);
		System.out.println("arrayto string:"+sk);
		System.out.println();
		//spilt method//
		String e="I love java";
		String []r=e.split(" ");
		System.out.println(Arrays.toString(r));	
	}
}