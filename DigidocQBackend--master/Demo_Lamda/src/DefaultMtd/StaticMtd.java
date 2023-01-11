package DefaultMtd;

public interface StaticMtd {

	public static void m1() {
		System.out.println("Interface Static Method");
	}
}

class Test2 implements StaticMtd {
	public static void main(String[] args) {
		
		StaticMtd.m1();
	}
}
