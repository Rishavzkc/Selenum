package FunctionInter;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {

		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);

		System.out.println("The Result of f1:" + f1.apply("AishwaryaAbhi"));
		System.out.println("The Result of f2:" + f2.apply("AishwaryaAbhi"));
		System.out.println("The Result of f1.andThen(f2):" + f1.andThen(f2).apply("AishwaryaAbhi"));
		System.out.println("The Result of f1.compose(f2):" + f1.compose(f2).apply("AishwaryaAbhi"));
	
	System.out.println("*********************************");
	System.out.println();
	
	
	Function<Integer,Integer> f3= i->i+i; 
	 Function<Integer,Integer> f4= i->i*i*i; 
	System.out.println(f3.andThen(f4).apply(2));
	System.out.println(f3.compose(f4).apply(2));
	}

}
