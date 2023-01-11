package Program;

public abstract class Employee {
	
String name;
int id;
String address;

Employee(){
	System.out.println("Default Constructor");
}

Employee(String name, int id, String address){
	this.name =name;
	this.id= id;
	this.address=address;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public void status() {
	System.out.println("Employee is working...");
}

abstract void exprience();
}

class Department extends Employee{
	
public void Band() {
	System.out.println("Band level is .... ");
}
public void status(){
	System.out.println("Employee is for Deparment");
}

void exprience()  
{  
System.out.println("Abstract method called.");  
}  
}

class Test{
	public static void main(String[] args) {
		Department d =new Department();
		d.setName("John");
		System.out.println();
		d.Band();
		d.status();
		d.exprience();
	}
}
