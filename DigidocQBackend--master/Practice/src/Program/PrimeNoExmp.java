package Program;

public class PrimeNoExmp {

	public static void main(String[] args) {
		
		int num =43;
		int i ;
		int temp =0;
		
		for (i =2; i<num; i++) {
			if(num %2 ==0) {
				temp ++;
			}
		}
		
		if (temp ==0) {
			System.out.println("Prime No.");
		}
		else
			System.out.println("Not Prime no.");
		
		

	}

}
