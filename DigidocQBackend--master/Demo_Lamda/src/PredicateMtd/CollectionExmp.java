package PredicateMtd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionExmp {
public static void main(String[] args) {
	
	Predicate <Collection> p = c -> c.isEmpty()  ;
	ArrayList a1 =new ArrayList();
	  a1.add("A");
	  
	  System.out.println(p.test(a1));
	  ArrayList a2 =new ArrayList();
	  System.out.println(p.test(a2));
	  
}
}
