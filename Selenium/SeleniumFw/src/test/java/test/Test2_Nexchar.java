package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test2_Nexchar {
	public static void main(String[] args) {
		nexcharWebsite();
	}
	public static void nexcharWebsite(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\Selenium\\SeleniumFw\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		// goto nexchar website
		driver.get("https://nexchar.com/");
		// goto signup page by using xpath by performing clicking action
		
		driver.findElement(By.xpath("//a[@class='btn btn-register']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.className("nav-link")).sendKeys(Keys.RETURN);
		//Sign in page go
		//driver.findElement(By.xpath("//a[@class='nav-link']//span[@class='nav-link-title'][contains(text(),'Sign In')]")).click();
	}

}
