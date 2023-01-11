package Program;

public class RemoveElement {

	public static void main(String[] args) {
		
		int arr1[]= {20,34,56,78,90};
		int arr2[]= new int [arr1.length];
		
		int m =3;
		for (int i=0;i<arr1.length; i++) {
			if(i<m) {
				arr2[i]=arr1[i];
			}
			else if(i ==m){
				continue;
			}
			else {
				arr2[i-1]= arr1[i];
			}
		}
		for(int j =0; j<arr1.length-1; j++) {
			System.out.println(arr2[j]);
		}

	}

}
