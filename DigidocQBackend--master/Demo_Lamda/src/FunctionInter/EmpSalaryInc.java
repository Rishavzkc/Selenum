package FunctionInter;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpSalaryInc {

	String name;
	double salary;

	EmpSalaryInc(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + ":" + salary;
	}
}

class Test2 {
	public static void main(String[] args) {
		ArrayList<EmpSalaryInc> l = new ArrayList<EmpSalaryInc>();
		populate(l);

		System.out.println("Before Increment:");
		System.out.println(l);

		Predicate<EmpSalaryInc> p = e -> e.salary < 3500;
		Function<EmpSalaryInc, EmpSalaryInc> f = e -> {
			e.salary = e.salary + 477;
			return e;
		};

		System.out.println("After Increment:");
		ArrayList<EmpSalaryInc> l2 = new ArrayList<EmpSalaryInc>();
		for (EmpSalaryInc e : l) {
			if (p.test(e)) {
				l2.add(f.apply(e));
			}
		}
		System.out.println(l);
		System.out.println("Employees with incremented salary:");
		System.out.println(l2);
	}

	public static void populate(ArrayList<EmpSalaryInc> l) {
		l.add(new EmpSalaryInc("John", 1000));
		l.add(new EmpSalaryInc("Andrew", 2000));
		l.add(new EmpSalaryInc("Jack", 3000));
		l.add(new EmpSalaryInc("Ram", 4000));
		l.add(new EmpSalaryInc("Jacky", 5000));
		l.add(new EmpSalaryInc("Shyam", 10000));
	}
}
