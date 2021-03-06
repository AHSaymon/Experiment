package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNgDemo {
	WebDriver driver= null;
	
	@BeforeTest
	public void setUpTest(){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\Selenium\\SeleniumFw\\drivers\\geckodriver\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
	
	@Test
	public static void nexcharWebsite(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\Selenium\\SeleniumFw\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		// goto nexchar website
		driver.get("https://nexchar.com/");
		// goto signup page by using xpath by performing clicking action
		driver.findElement(By.xpath("//a[@class='btn btn-register']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.className("nav-link")).sendKeys(Keys.RETURN);
		// close browser
		driver.close();
		
	}
	
	@AfterTest
	public void tearDownTest(){
		// close browser
				driver.close();
				
	}

}
