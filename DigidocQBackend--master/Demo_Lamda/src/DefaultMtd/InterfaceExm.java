package DefaultMtd;

public interface InterfaceExm {

	default void m1() {
		System.out.println("Default Method");
	}
}

class Test implements InterfaceExm{
	public void m1 () {
		System.out.println("My Own Implementation");
	}
	public static void main(String[] args) {
		Test t =new Test();
		t.m1();
	}
}