import java.util.*;
import java.util.stream.Stream;
import java.util.stream.*;

public class Lan {
	public static void main(String[]args) {
		
		ArrayList<employe>a=new ArrayList<employe>();
		employe e1=new employe("Rajesh",23,101,20000,1);
		employe e2=new employe("Vijay",25,105,30000,2);
		employe e3=new employe("Arun",23,107,50000,3);
		employe e4=new employe("Raj",23,102,60000,3);
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		Stream<employe>st= a.stream();
	st.filter(f->f.age==23).map(m->{m.salary=m.salary+10000;return m;}).sorted((s1,ss)->{Integer i=s1.id;Integer ii=ss.id;return i.compareTo(ii);}).forEach(ff->System.out.println(ff));
	

	}

}
 class employe{	
	String name;
	int age;
	int id;
	int salary;
	int exp;
	public employe(String name,int age,int id,int salary,int exp) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.salary=salary;
		this.exp=exp;}
	
		public String toString() {
			return name+":"+age+":"+id+":"+salary+":"+exp;
			
		}
		
		
	
}


