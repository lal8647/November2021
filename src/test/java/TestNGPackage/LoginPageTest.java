package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
     WebDriver driver;
     SoftAssert softAssert;
     
     
	@BeforeMethod
	
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://app.hubspot.com/login");
		softAssert = new SoftAssert();
		
	}
	
	@Test
	public void loginPageTitleTest() {
		String title= driver.getTitle();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		System.out.println("page title is: " + title);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertEquals(title, "HubSpot Login");
		/*if (title.equals("HubSpot Login")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	} */
	}
	
	@Test
	public void signUpTest()
	{
		boolean flag= driver.findElement(By.linkText("Sign up")).isDisplayed();
	    Assert.assertTrue(flag);
	}
		
	@AfterMethod
	
	public void tearDown() {
		driver.close();
	}
}
