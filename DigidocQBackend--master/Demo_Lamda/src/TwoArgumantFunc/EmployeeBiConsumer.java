package TwoArgumantFunc;

import java.util.ArrayList;
import java.util.function.BiConsumer;

// Program to increment employee Salary by using BiConsumer
public class EmployeeBiConsumer {
	String name;
	double salary;

	EmployeeBiConsumer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

class Test7 {
	public static void main(String[] args) {
		ArrayList<EmployeeBiConsumer> l = new ArrayList<EmployeeBiConsumer>();
		populate(l);

		BiConsumer<EmployeeBiConsumer, Double> c = (e, d) -> e.salary = e.salary + d;
		for (EmployeeBiConsumer e : l) {
			c.accept(e, 500.0);
			
//			System.out.println("Employee Name:" + e.name);
//			System.out.println("Employee Salary:" + e.salary);
//			System.out.println();

		}
		for (EmployeeBiConsumer e : l) {
			System.out.println("Employee Name:" + e.name);
			System.out.println("Employee Salary:" + e.salary);
			System.out.println();
		}
	}

	public static void populate(ArrayList<EmployeeBiConsumer> l) {
		l.add(new EmployeeBiConsumer("Raj", 1000));
		l.add(new EmployeeBiConsumer("Ram", 2000));
		l.add(new EmployeeBiConsumer("John", 3000));
		l.add(new EmployeeBiConsumer("Jack", 4000));
	}
}
