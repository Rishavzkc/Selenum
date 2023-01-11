package FunctionInterface;

//public class ThreadExample implements Runnable {
//
//	public void run () {
//		for (int i=0; i<=10; i++) {
//			System.out.println("Child Thread");
//		}		
//	}
//}
//
//class ThreadDemo{
//	public static void main(String[] args) {
//		Runnable r =new ThreadExample();
//		Thread t =new Thread(r);
//		t.start();
//		for (int i=0; i<=10; i++) {
//			System.out.println("Main Thread");
//		}
//	}
//}

public class ThreadExample{
	public static void main(String[] args) {
		Runnable r = ()-> {
			for (int i =0; i<=10; i++) {
				System.out.println("Lambda : Child Thread");
			}
		};
		Thread t =new Thread(r);
		t.start();
		for (int i=0; i<=10; i++) {
			System.out.println("Main Thread");
		}
	}
	}
