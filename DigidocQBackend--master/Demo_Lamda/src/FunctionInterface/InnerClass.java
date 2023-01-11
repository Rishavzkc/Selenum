package FunctionInterface;

public class InnerClass {

	int x =777;
	public void m22() {
		
		//by Using Inner Class
//		InnerInterf ii =new InnerInterf () {
//			 int x =999;
//			 
//			 public void m11() {
//				 System.out.println(this.x);
//			 }
//		};
//		ii.m11();
		
		//By using lambda Expression
		InnerInterf ii =() ->{
			int x =999;
			System.out.println(this.x);
		};
		ii.m11();
	}
	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		ic.m22();
	}
}
