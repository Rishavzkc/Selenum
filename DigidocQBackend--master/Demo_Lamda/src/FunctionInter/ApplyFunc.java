package FunctionInter;

import java.util.function.Function;

public class ApplyFunc {

	public static void main(String[] args) {
		
		Function <String, Integer> f = s -> s.length();
		System.out.println(f.apply("John"));
System.out.println(f.apply("Company"));

Function <Integer, Integer> fu = i -> i*i ;
System.out.println(fu.apply(5));
System.out.println(fu.apply(10));
	}

}
