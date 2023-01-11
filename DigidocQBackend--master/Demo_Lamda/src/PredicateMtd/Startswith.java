package PredicateMtd;

import java.util.function.Predicate;

public class Startswith {
public static void main(String[] args) {
	
	String [] names = {"Ram","karan" ,  "James" , "kajal","king"};
	Predicate <String> startsWithK = s -> s.charAt(0) =='k';

System.out.println("Names Starts With K are : ");
for (String s:names) {
	if(startsWithK.test(s)) {
		System.out.println(s);
	}
}

}

}
