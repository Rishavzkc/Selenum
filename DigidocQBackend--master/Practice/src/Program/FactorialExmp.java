package Program;

public class FactorialExmp {

	public static void main(String[] args) {
		int num =5;
		int res =1;
		while (num>0) {
			res =res*num;
			num --;
		}
		System.out.println("Factorial is : " +res);

	}

}
