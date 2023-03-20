class member
{
	String name;
	int age;
	String number;
	String adderss;
	int salary;
	public void printsalary()
	{
		System.out.println(salary);
	}
}
class Employee extends member
{
	String sepcialization;
}
class Manager extends member
{
	String depratment;
}
class ex
{
public static void  main(String[]args)
{
Employee e=new Employee();
	e.name="arun";
	e.age=21;
	e.number="8489340398";
	e.adderss="xy";
	e.salary=20000;
	e.sepcialization="xxxyyy";
	e.printsalary();
Manager m=new Manager();
}
}		
	