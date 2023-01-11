package DefaultMtd;


//Ambiguity Problem in Default method 
interface AmbiguityRight {
	
	default void m1() {
		System.out.println("Right Default Method");
	}
}

 interface AmbiguityLeft {
	
	default void m1() {
		System.out.println("Left Default Method");
	}
}
 
 class Test1 implements AmbiguityRight , AmbiguityLeft {

	public void m1() {
	//	System.out.println("My Own Implementation");
	AmbiguityLeft.super.m1();
	}
	 
	public static void main(String[] args) {
		Test1 t1 =new Test1();
		t1.m1();
	}
 }