package PredicateMtd;

import java.util.function.Predicate;

public class IsEqualExmp {

	public static void main(String[] args) {
		Predicate <String> p = Predicate.isEqual("DURGASOFT");
		System.out.println(p.test("JOHN"));
		System.out.println(p.test("DURGASOFT"));
		System.out.println(p.test("durgasoft"));

	}

}
