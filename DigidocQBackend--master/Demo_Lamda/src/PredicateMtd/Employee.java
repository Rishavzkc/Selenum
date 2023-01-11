package PredicateMtd;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
String name;
String designation;
double salary;
String city;
public Employee(String name, String designation, double salary, String city) {
	this.name = name;
	this.designation = designation;
	this.salary = salary;
	this.city = city;
}

public String toString() {
String s =String.format("%s, %s, %.2f, %s",name, designation, salary, city);

return s;
}

}

class Test4{
	public static void main(String[] args) {
		ArrayList <Employee> list = new ArrayList<Employee>();

         populate(list);
         
         Predicate <Employee> p1= emp -> emp.designation.equals("Tester");
		System.out.println("Tester Information : ");
		display(p1,list);
		
		  Predicate <Employee> p2= emp -> emp.city.equals("Hyd");
			System.out.println("Pune Employee Information : ");
			display(p2,list);
			
			 Predicate <Employee> p3= emp -> emp.salary <30000;
				System.out.println("Employee  Salary less than 30000 : ");
				display(p3,list);
				
				System.out.println("All tester from Hyd given pink slip ");
				display(p1.and( p2) ,list);
				
				System.out.println("All tester or whose  salary less than 30000 ");
				display(p1.or( p2) ,list);
				
				System.out.println("All Employee who are not Tester ");
				display(p1.negate(),list);
	}
	
	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Ram","Developer", 30000,"Pune"));
        list.add(new Employee("Raj","Tester", 38000,"Hyd"));
        list.add(new Employee("Raju","IT", 28000,"Blr"));
        list.add(new Employee("Rajan","Lead", 48000,"Pune"));
        list.add(new Employee("Arun","Tester", 38000,"Hyd"));
        list.add(new Employee("Ajay","Engineer", 25000,"Hyd"));
	}
	
	public static void display (Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee e :list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("**********************************");
	}
}