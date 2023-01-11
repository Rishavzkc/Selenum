package FunctionInterface;

//public class Demo implements Inter1{
//
//	public void add(int a, int b) {
//		System.out.println("The Sum is " + (a+b));
//	}
//}
//
//class Test1{
//	public static void main(String[] args) {
//		Inter1 i =new Demo();
//		i.add(10, 20);
//					
//	}
//}

public class Demo {

	public static void main(String[] args) {
		
		Inter1 i = (a,b) -> System.out.println("The sum by lamda Expression is  : " + (a+b));
		
		i.add(10, 20);

	}

}