package TestNGPackage;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestwithAllAssertion {
	
	//Before--BS BT BC BM
	//Test--@Test
	//After---AM AC AT AS
	
	WebDriver driver;
	
	By username = By.id("username");
	By password= By.id("password");
	By login= By.id("loginBtn");
	By signup= By.linkText("Sign up");
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite----");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test---get the value from db");
	}
	
	@BeforeClass
	
	public void beforeClass()
	{
		System.out.println("before Class--DB credentials");
	}
	@BeforeMethod
	
	public void setup() {
		System.out.println("Before Method------");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://app-eu1.hubspot.com/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	public void signUpLinkTest() {
		
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
		
	}
	
	@Test(priority=2, enabled=false)
	
	public void pageTitleTest() {
		
		String title = driver.getTitle();
		System.out.println("page title is :" + title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=3, enabled=false)
	
	public void loginTest() {
		driver.findElement(username).sendKeys("lalmohanjha@gmail.com");
		driver.findElement(password).sendKeys("Dost1234!!");
		driver.findElement(login).click();
	}
	
	
	
	@AfterMethod
	
	public void tearDown() {
		System.out.println("After Method------");
		driver.close();
	}
	
	@AfterClass
	
	public void afterClass() {
		System.out.println("After class----");
	}
	
    @AfterTest
	
	public void AfterTest() {
		System.out.println("Before Test----");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite-----");
	}
	
	
	
	
	

}
