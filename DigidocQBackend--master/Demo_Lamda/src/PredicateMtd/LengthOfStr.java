package PredicateMtd;

import java.util.function.Predicate;

public class LengthOfStr {

	public static void main(String[] args) {
	
		Predicate <String> p = s -> s.length() >5;
		System.out.println(p.test("Hello"));
		System.out.println(p.test("Length of String"));

	}

}
