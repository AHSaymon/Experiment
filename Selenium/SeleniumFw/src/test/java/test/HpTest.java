package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.NexcharHomepageObject;

public class HpTest {
	// Webdriver call
	static WebDriver driver= null;
	public static void main(String[] args) {
		// function call
		HpTesting();
	}
	public static void HpTesting(){
		// set property
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\Selenium\\SeleniumFw\\drivers\\geckodriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		
		// creating NexcharHomepageObject object 
		NexcharHomepageObject homepageObject= new NexcharHomepageObject(driver);
		driver.get("https://nexchar.com/");
		// call the action
		homepageObject.clickSignUpButton();
		homepageObject.clickdemopage();
	}
}
