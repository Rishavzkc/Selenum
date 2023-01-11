package Program;

public class SwapNumber {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		
		System.out.println("Before swapping: "+a);
		System.out.println("Before swapping: "+b);
		
		a =a+b;
		b =a -b;
		a =a-b;
		System.out.println("After swapping: "+a);
		System.out.println("After swapping: "+b);
	}

}
