package PredicateMtd;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmptyString {

	public static void main(String[] args) {
		String names[]= {"Ram", " ", null, "Ravi"," ", "Shyam", null};

		Predicate <String> p = s-> s !=null  && s.length() != 0;
		
		ArrayList <String> al =new ArrayList <String> ();
		
		for (String s : names) {
			if (p.test(s)) {
			 al.add(s);
			}
		}
		
		System.out.println("The List of Valid Names");
		System.out.println(al);
	}

}
