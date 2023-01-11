package FunctionInter;

import java.util.function.Function;

public class IdentityMtd {
	 public static void main(String[] args) 
	  { 
	 Function<String,String> f1= Function.identity(); 
	 String s2= f1.apply("durga"); 
	 System.out.println(s2); 
	 }
	 
}
