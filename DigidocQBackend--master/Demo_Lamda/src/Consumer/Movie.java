package Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	String name;
	String hero;
	String heroine;

	Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}

class Test {
	public static void main(String[] args) {
	
		ArrayList<Movie> al = new ArrayList<Movie>();
		populate(al);
		
		
		Consumer<Movie> c =m ->{
			System.out.println("Movie name : " + m.name);
			System.out.println("Hero: "+ m.hero);
			System.out.println("Heroine: "+ m.heroine);
			System.out.println();
		};
		
		for(Movie m : al) 
			{ 
			c.accept(m); 
			}
	}

	public static void populate(ArrayList<Movie> al) {
		al.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		al.add(new Movie("Rayees", "Sharukh", "Sunny"));
		al.add(new Movie("Dangal", "Ameer", "Ritu"));
		al.add(new Movie("Sultan", "Salman", "Anushka"));
	}
}
