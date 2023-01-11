package FunctionInterface;

//public class Example2 implements Exampl2{
//
//	public int squareroot(int x) {
//		return  x *x;
//	}
//}
// class Test2 {
//	 public static void main(String[] args) {
//		 Exampl2 e =new Example2();
//		 
//		 System.out.println("Square root is : "+ e.squareroot(4));
//		 System.out.println("Square root is : "+ e.squareroot(5));
//	} 
// }

public class Example2{
	public static void main(String[] args) {
		Exampl2 e =  x ->x*x;
		System.out.println("Square root is : "+ e.squareroot(4));
	System.out.println("Square root is : "+ e.squareroot(5));
	}
}
