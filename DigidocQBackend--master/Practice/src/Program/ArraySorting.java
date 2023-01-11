package Program;

public class ArraySorting {
public static void main(String[] args) {
	

	int arr []= {8,5,0,5,3,2,1,0};
	int temp;
	for (int i = 0; i<arr.length; i++) {
		for (int j =0; j<arr.length -1; j++) {
			if(arr[j]>arr[j +1]) {
				temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1] =temp;
			}
		}
	}
	for (int k =0; k<arr.length; k++) {
		System.out.println(arr[k]);
	}
}
}
