package TestNGPackage;

import org.testng.annotations.Test;

public class DependsOnMethod {

	
	
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("Login test");
	}
	
	@Test(priority = 2, dependsOnMethods= "loginTest")
	
	public void homePageTest() {
		System.out.println("home page Test");
	}
    @Test(priority = 3, dependsOnMethods= "loginTest")
	
	public void searchTest() {
		System.out.println("search Test");
	}
	
}
