package FunctionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WithoutLambdaComparator implements Comparator <Integer>{

	public int compare(Integer o1, Integer o2) {
//	if (o1>o2) {
//		return -1;
//	}
//	else if (o1<o2) {
//		return +1;
//	}
//	else return 0;
//	}
return (o1>o2) ? -1: (o1<o2) ? +1: 0 ; 
}
}
class Test{
	public static void main(String[] args) {
		ArrayList <Integer> al =new ArrayList <Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(20);
		al.add(5);
		
		System.out.println("Berfore Sorting : "+ al);
		Collections.sort(al, new WithoutLambdaComparator ());
		System.out.println("After Sorting : "+ al);
	}
}
