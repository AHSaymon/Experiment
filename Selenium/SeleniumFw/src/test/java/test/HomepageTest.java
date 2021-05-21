package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.NexcharHomepage;
public class HomepageTest {
	static WebDriver driver= null;
	public static void main(String[] args) {
		nexcharWebsite();
	}
	public static void nexcharWebsite(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\Selenium\\SeleniumFw\\drivers\\geckodriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		// goto nexchar website
		driver.get("https://nexchar.com/");
		NexcharHomepage.signup_pagevisit(driver).sendKeys(Keys.RETURN);
		
		NexcharHomepage.demo_pagevisit(driver).click();
		
		driver.close();
		System.out.println("Test ok");
		// goto signup page by using xpath by performing clicking action
		//driver.findElement(By.xpath("//a[@class='btn btn-register']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.className("nav-link")).sendKeys(Keys.RETURN);
	}

}
