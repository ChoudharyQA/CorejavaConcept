package Corejavapackage;

import org.testng.annotations.Test;

public class PS1 extends PS{
	
 @Test
 public void testRun() {
	 
	 PS2 ps2= new PS2(3);// parameterized constructor - Basically we will create this when we are passing any parameter while creating object like in this, we are passing "3" as declared parameter and then passing it through object "ps2"
	 // Parameterized constructor will be created in "PS2' class.
	 int a = 3;
	 System.out.println(ps2.increment());
	 System.out.println(ps2.decrement());
	 System.out.println(ps2.multiplyByTwo());
	 System.out.println(ps2.multiplyByThree());
	 
	 doThis(); // This method is coming from our parent class PS
 }

}
