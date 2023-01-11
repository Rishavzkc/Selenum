package Streams;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Lamdaex1 {
	
	public static void main(String[] args) {
		
		
	}
	@Test
	public void regular() {
		ArrayList<String> al = new ArrayList<String> ();
	     al.add("Aman");
	     al.add("Andrew");
	     al.add("John");
	     al.add("JAck");
	     al.add("Raj");
	    
	     
	     int count =0;
	   
	     for (int i=0; i<al.size(); i++) {
	    	 String name= al.get(i);
	    	 if(name.startsWith("A")) {
	    		 count ++;
	    	 }
	    	  }
	     System.out.println(count);
	}
	
	//lamda expression
	@Test
	public void lambda() {
		ArrayList<String> al = new ArrayList<String> ();
	     al.add("Aman");
	     al.add("Andrew");
	     al.add("John");
	     al.add("JAck");
	     al.add("Raj");
	     
	     
	   Long print=  al.stream().filter(s->s.startsWith("A")).count();
	   System.out.println(print);
	}
	
	
	}


