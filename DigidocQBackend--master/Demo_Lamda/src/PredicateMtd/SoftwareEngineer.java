package PredicateMtd;

import java.util.function.Predicate;

public class SoftwareEngineer {
String name;
int age;
boolean isHavingGf;
public SoftwareEngineer(String name, int age, boolean isHavingGf) {

	this.name = name;
	this.age = age;
	this.isHavingGf = isHavingGf;
}
public String toString() {
	return "SoftwareEngineer [name=" + name + ", age=" + age + ", isHavingGf=" + isHavingGf + "]";
}
}

class Test3{
	public static void main(String[] args) {
	SoftwareEngineer [] list = { new SoftwareEngineer ("John", 23, true),
			 new SoftwareEngineer ("Jack", 25, false),
			 new SoftwareEngineer ("Ram", 30, true),
			 new SoftwareEngineer ("Raj", 19, true),
			 new SoftwareEngineer ("Ravi", 43, true)	
	};
	
	Predicate<SoftwareEngineer> p = se -> se.age >=18 && se.isHavingGf ;
	
	System.out.println("The allowed memeber in Pub are: ");
	
	for(SoftwareEngineer se :list) {
		if (p.test(se)) {
			System.out.println(se);
		}
	}
	}
}
