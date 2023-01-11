package FunctionInterface;

import java.util.TreeMap;

public class TreeMapExmpl {
public static void main(String[] args) {
	
	TreeMap <Integer, String> tm = new TreeMap<Integer, String>((o1, o2)-> (o1>o2)? -1: (o1<o2)? 1:0);
	
	tm.put (100, "John");
	tm.put (400, "Jack");
	tm.put (300, "Ram");
	tm.put (600, "Shyam");
	tm.put (50, "Rohan");
	System.out.println(tm);
}
}
