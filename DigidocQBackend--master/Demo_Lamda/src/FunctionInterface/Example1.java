package FunctionInterface;

//public class Example1 implements Exampl1{
//
//	public int getlength(String s) {
//		return s.length();
//	}
//
//}
//class Test2 {
//	public static void main(String[] args) {
//		Exampl1 e = new Example1();
//		
//		System.out.println(e.getlength("Hello"));
//		System.out.println(e.getlength("Without Lambda"));
//	}
//	}

public class Example1{
	public static void main(String[] args) {
		
		Exampl1 e =   s -> s.length();
		System.out.println(e.getlength("Hello"));
	System.out.println(e.getlength("With Lambda"));
		
	}
}