package Program;

public class ReverseNo {

	public static void main(String[] args) {
		int num =354;
		int rem =0; 
		int result =0;
		
		while(num>0) {
			rem =num%10;
			result =result *10 +rem;
			num =num/10;
		}
		System.out.println("Reverse No:= "+ result);

	}

}
