package FunctionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class WithLambdaComparator {
public static void main(String[] args) {
	
	ArrayList <Integer> al =new ArrayList <Integer>();
	al.add(10);
	al.add(0);
	al.add(15);
	al.add(20);
	al.add(5);
	al.add(25);
	
	System.out.println("Berfore Sorting : "+ al);
	Collections.sort(al, (o1,o2) -> (o1>o2) ? -1: (o1<o2) ? +1: 0 );
	System.out.println("After Sorting : "+ al);
}
}
