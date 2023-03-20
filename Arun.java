import java.util.*;
class Arun
{
String s="Java is a widely used object-oriented programming language and software platform that runs on billions of devices"; 
		String s1="java";
		String s2="java";
		String s3="Rajesh";
		String s4="Arun";
		
		String s5="                 Android                 ";
		
		String a="arun";
		String b="Arun";
		public static void main(String[]args)
		{
			Arun x=new Arun();
			x.length();
			x.charAt();
			x.equals();
			x.compare();
			x.index();
			x.subString();
			x.concat();
			x.replace();
			x.upperCase();
			x.lowerCase();
			x.trim();
			x.startWith();
			x.endWith();
			x.value();
			x.equalsIgnore();
			x.string();
			x.get();
			x.split();;
			
		}
		void length()
		{
			System.out.println("length:"+s.length());
		}
		void charAt()
		{
			System.out.println("charAt"+s.charAt(55));
		}
		void equals()
		{
			System.out.println("equals:"+s1.equals(s2));
		}
		void compare()
		{
			System.out.println("compare:"+s1.compareTo(s2));
		}
		void index()
		{
			System.out.println("indexof charAt:"+s.indexOf('o'));
		System.out.println("indexof String:"+s.indexOf("run"));
		System.out.println("indexof charAt:"+s.lastIndexOf('e'));
		System.out.println();
		}
		void subString()
		{
			System.out.println("substring:"+s.substring(50));
		System.out.println();
		}
		void concat()
		{
			System.out.println("concat:"+s4.concat(s2));
					System.out.println();
		}
		void replace()
		{
			System.out.println("replace"+s.replace("run","go"));
		System.out.println();
		}
		void upperCase()
		{
			System.out.println("uppercase:"+s4.toUpperCase());
		System.out.println();
		}
		void lowerCase()
		{
			System.out.println("lowercase:"+s3.toLowerCase());
		System.out.println();
		}
		void trim()
		{
			System.out.println("trim:"+s5.trim());
		System.out.println();
		}
		void startWith()
		{
			System.out.println("starwith:"+s.startsWith("Java"));
		System.out.println();
		}
		void endWith()
		{
			System.out.println("endwith:"+s.endsWith("java"));
		System.out.println();
		}
		void value()
		{
			int n=80;
		String n1=String.valueOf(n);
		System.out.println("value:"+(n1+80));
		System.out.println();
		}
		void equalsIgnore()
		{
			System.out.println("equalignore:"+a.equalsIgnoreCase(b));
		System.out.println();
		}
		void string()
		{
			String y="Python";
		char[] ch=y.toCharArray();
		System.out.println("string :"+y+"to array"+Arrays.toString(ch));
		System.out.println();
		
					String sk=new String(ch);
		System.out.println("arrayto string:"+sk);
		System.out.println();
		}
		void get()
		{
			char[]ch1=new char[36];
		String c="Android is a mobile operation system";
		c.getChars(0,36,ch1,0);
		System.out.println("getChar"+Arrays.toString(ch1));
		System.out.println();
		}
		void split()
		{
			String e="I love java";
		String []r=e.split(" ");
		System.out.println(Arrays.toString(r));
		}

}		
		