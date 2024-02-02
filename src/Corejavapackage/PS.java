package Corejavapackage;

import org.testng.annotations.BeforeMethod;

public class PS {
	
	
	public void doThis() {
		
		System.out.println("I am here");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before");
	}
}
