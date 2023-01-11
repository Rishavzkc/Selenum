package FunctionInter;

import java.util.function.Function;

public class RemoveEmptySpace {

	public static void main(String[] args) {
		
		String s= "This is Software Company";

		Function <String , String> f  = s1 -> s1.replaceAll(" ", "");
		System.out.println(f.apply(s));
		
		Function <String, Integer> fun =s2 ->(s2.length() -s2.replaceAll(" ", "").length());
	
		System.out.println(fun.apply(s));
	}

}
