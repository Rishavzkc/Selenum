package FunctionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
 int empno;
 String ename;
 
public Employee(int empno, String ename) {
	super();
	this.empno = empno;
	this.ename = ename;
}

public String toString() {
	return  empno + " : " + ename ;
}
  
}

class Test1  {
	public static void main(String[] args) {
		 
	ArrayList <Employee> e =new ArrayList <Employee>();
		e.add(new Employee (200, "John"));
		e.add(new Employee (100, "Ram"));
		e.add(new Employee (400, "Jack"));
		e.add(new Employee (700, "Jonny"));
		e.add(new Employee (900, "Arun"));
		
		System.out.println("Before Sorting  :");
		System.out.println(e);
 Collections.sort(e ,(e1,e2) ->(e1.empno >e2.empno) ? -1 : (e1.empno<e2.empno)? 1 : 0);
		
		System.out.println("After Sorting  :");
		System.out.println(e);
	}
}
