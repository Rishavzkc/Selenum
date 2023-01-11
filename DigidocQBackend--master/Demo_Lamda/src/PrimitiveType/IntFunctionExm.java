package PrimitiveType;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunctionExm {

	public static void main(String[] args) {
	
		//input and return type are int
		IntFunction <Integer> f =i-> i*i;
		System.out.println(f.apply(5));

		//input type is String and return type is Int
	ToIntFunction <String> f1 =s -> s.length();
	System.out.println(f1.applyAsInt("John"));

	//input int and return type double
	IntToDoubleFunction f2 = j ->Math.sqrt(j);
	System.out.println(f2.applyAsDouble(10));
	
	
	}

}
