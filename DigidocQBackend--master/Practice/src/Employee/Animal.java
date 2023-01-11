package Employee;

public class Animal {
 String name;
 int legs;
 
 Animal(){

 }
 Animal(String name, int legs){
	 this.name =name;
	 this.legs =legs;
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLegs() {
	return legs;
}
public void setLegs(int legs) {
	this.legs = legs;
}
  
public  void sound() {
	System.out.println("Makes Sounds");
}

public void breed() {
	System.out.println("The breed of animal");
}

}

class Dog extends Animal{
	
	public void run() {
		System.out.println("Running");
	}
	public void breed() {
		System.out.println("The breed is of dog");
	}
}
class Test{
	public static void main(String[] args) {
		Dog d =new Dog();
		d.sound();
		
		d.setName("Lion");
		System.out.println("Name is : "+ d.getName());
		
		d.breed();
	}
}
