package FunctionInterface;

import java.util.TreeSet;

public class TreeSetExmpl {

	public static void main(String[] args) {
		TreeSet<Integer> ts =new TreeSet <Integer>(	(o1,o2) -> (o1>o2)? -1: (o1<o2)? 1 : 0 );
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(20);
		ts.add(5);
		ts.add(25);
		System.out.println(" Sorting : "+ ts);
		
	
	}

}
