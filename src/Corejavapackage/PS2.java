package Corejavapackage;

public class PS2 extends PS3{
	
	
	int a; // This is our global class variable which is called in our below increment and decrement method.
	public PS2(int a) { // In this "a" is the instance variable and we need to assign this instance variable to our global class variable "a" in terms of value 
		// From our PS1 class the value is coming to this instance variable so we need to assign that value to our global variable so that it can be called in our below increment and decrement method with its value
		// And for assigning value from instance variable to our global variable, we will use "this"
		// Above "public PS2(int a)" is part of parameterized constructor 
		super(a); // "super" keyword is used to activate the parent class (PS3) constructor.
		this.a=a; // "this" keyword refer to the current class variable which is "PS1" class and "a" variable in our case
		
	}

	public int increment() {
		
		a= a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}
	
	
	
	

}
