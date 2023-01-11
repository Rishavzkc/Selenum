package TwoArgumantFunc;

import java.util.function.BiFunction;

//calculate Monthly Salary with Employee and TimeSheet objects as input 
public class EmployeeBiFunc {

	int eno;
	String name;
	double dailyWage;

	EmployeeBiFunc(int eno, String name, double dailyWage) {
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
}

class TimeSheet {
	int eno;
	int days;

	TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}

class Test1 {
	public static void main(String[] args) {
	BiFunction<EmployeeBiFunc,TimeSheet,Double> f=(e,t)->e.dailyWage*t.days;
		EmployeeBiFunc e = new EmployeeBiFunc(100, "Ram", 600);
		TimeSheet t = new TimeSheet(100, 20);
			System.out.println("Monthly Salary :  " + f.apply(e, t));
	}
}
