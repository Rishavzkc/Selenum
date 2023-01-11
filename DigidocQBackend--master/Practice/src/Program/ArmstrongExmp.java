package Program;

public class ArmstrongExmp {

	public static void main(String[] args) {
		int n =153;
		int temp =0;
		int res =0;
		int original =n;
		
		while (n>0) {
			temp =n %10;
			n =n/10;
			res =res +temp *temp *temp ;
		}
		System.out.println(res);
		if (res ==original) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}


	}

}
