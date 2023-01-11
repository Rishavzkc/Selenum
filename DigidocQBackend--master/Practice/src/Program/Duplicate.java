package Program;

public class Duplicate {

	public static void main(String[] args) {
		
		int  arr [] = {1, 2, 4, 5, 67, 7, 2, 4};
for (int i =0; i<arr.length; i++) {
	for(int j =1+1; j<arr.length; j++) {
		if (arr[i]==arr[j]) {
			System.out.println(arr[j]);
		}
	}
}

		
	}

}
