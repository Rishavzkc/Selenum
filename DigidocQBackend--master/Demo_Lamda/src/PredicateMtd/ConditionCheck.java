package PredicateMtd;

import java.util.function.Predicate;

public class ConditionCheck {
public static void main(String[] args) {
	
	Predicate <Integer> p = I-> I >10;
	
	System.out.println(p.test(100));
	System.out.println(p.test(5));
	
}
}
