package FunctionInter;

import java.util.ArrayList;
import java.util.function.Function;

 class EmployeeSalary {

	String name;
	double salary;
	
	EmployeeSalary(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return  name + ": " + salary;
	}
}


class Test1 
{ 
 public static void main(String[] args) 
{ 
ArrayList<EmployeeSalary> l= new ArrayList<EmployeeSalary>(); 
 populate(l); 
 System.out.println(l); 
Function<ArrayList<EmployeeSalary>,Double> f= l1 ->{ 
double total=0; 
for(EmployeeSalary e: l1) 
{ 
 total=total+e.salary; 
} 
 return total; 
 }; 
System.out.println("The total salary of this month:"+f.apply(l)); 
} 
 

 public static void populate(ArrayList<EmployeeSalary> l) {
		l.add(new EmployeeSalary ("Jack", 1000));
		l.add(new EmployeeSalary("John", 6500));
		l.add(new EmployeeSalary("Ram", 5500));
		l.add(new EmployeeSalary("Andrew", 4500));
		l.add(new EmployeeSalary("Sunny", 2500));
	}
}