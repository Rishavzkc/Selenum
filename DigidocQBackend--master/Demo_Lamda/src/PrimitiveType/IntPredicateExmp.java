package PrimitiveType;

import java.util.function.IntPredicate;

public class IntPredicateExmp {

	public static void main(String[] args) {
		
		int x[]= {10,15,20,43,25,44};
		
		IntPredicate p = i -> i %2 ==0;
		for(int x1:x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}

	}

}
