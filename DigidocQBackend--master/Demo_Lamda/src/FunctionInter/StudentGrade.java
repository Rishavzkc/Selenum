package FunctionInter;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGrade {

	String name;
	int marks;
	
	public StudentGrade(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}	
}

class Test{
	public static void main(String[] args) {
		ArrayList <StudentGrade> al =new ArrayList <StudentGrade>();
		populate(al);
		
		Function<StudentGrade, String > f =s -> { int marks =s.marks ;
		if (marks >=80) {
			return "A [Distinction] "; 
		} else if(marks >=60) {
			return "B [First Grade ]";
		} else if(marks >=50) {
			return "C [Second Grade ]";
		} else if(marks >=35) {
			return "D [Third Grade ]";
		}else 
		return "E [Fail]" ;		
		};
		
		for (StudentGrade s :al) {
			System.out.println("Name:  "+ s.name);
			System.out.println("Marks: " + s.marks);
			System.out.println("Grade: "+ f.apply(s));
		}
		
		Predicate <StudentGrade> p = s->s.marks >=60; 
		for(StudentGrade s :al ) {
		
			if(p.test(s)) {
     			System.out.println("Name: " + s.name);
				System.out.println("Marks: " + s.marks);
				System.out.println("Grade: " + f.apply(s));
				System.out.println();
			}
		}
	}
	
	public static void populate(ArrayList<StudentGrade> al) {
		al.add(new StudentGrade ("Jack", 100));
		al.add(new StudentGrade ("John", 65));
		al.add(new StudentGrade ("Ram", 55));
		al.add(new StudentGrade ("Andrew", 45));
		al.add(new StudentGrade ("Sunny", 25));

	}
}