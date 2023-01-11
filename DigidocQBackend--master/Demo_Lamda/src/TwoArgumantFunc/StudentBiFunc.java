package TwoArgumantFunc;

import java.util.ArrayList;
import java.util.function.BiFunction;


//create Student Object by taking name and rollno as input by using BiFunction
public class StudentBiFunc {

	String name;
	int rollno;

	StudentBiFunc(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}

class Test {
	public static void main(String[] args) {
		ArrayList<StudentBiFunc> al = new ArrayList<StudentBiFunc>();

		BiFunction<String, Integer, StudentBiFunc> f = (name, rollno) -> new StudentBiFunc(name, rollno);
		al.add(f.apply("Ram", 300));
		al.add(f.apply("Raj", 100));
		al.add(f.apply("John", 400));
		al.add(f.apply("Jack", 250));

		for (StudentBiFunc s : al) {
			System.out.println("Student Name : " + s.name);
			System.out.println("Student RollNo. : " + s.rollno);
			System.out.println();
		}
	}
}
