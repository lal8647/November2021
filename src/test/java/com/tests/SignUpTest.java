package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	WebDriver driver;
	
	By firstName=By.id("UIFormControl-2");
	By lastName= By.id("UIFormControl-4");
	By emailAddress= By.id("UIFormControl-6");
	By next= By.id("");
    @BeforeTest
	
	public void setup() {
		System.out.println("Before Method------");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://app-eu1.hubspot.com/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
    
    @Test
    public void verifyCreateAccountTest()
    {
    	
    	
    	
    }
}
