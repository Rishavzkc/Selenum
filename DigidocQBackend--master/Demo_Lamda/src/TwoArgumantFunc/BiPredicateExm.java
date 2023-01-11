package TwoArgumantFunc;

import java.util.function.BiPredicate;

public class BiPredicateExm {
	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
		System.out.println(p.test(20, 40));
		System.out.println(p.test(10, 25));
	}
}
