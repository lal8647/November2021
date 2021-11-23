package TestNGPackage;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	//@Test(expectedExceptions = ArithmeticException.class)
	@Test(expectedExceptions = Throwable.class)
	//@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	 public void loginTest() {
		System.out.println("Login test--start");
		int i=9/0;
		System.out.println("login test end");
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
