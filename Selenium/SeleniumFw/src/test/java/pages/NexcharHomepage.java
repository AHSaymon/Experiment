package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NexcharHomepage {
	private static WebElement element= null;
	public static WebElement signup_pagevisit(WebDriver driver){
		//driver.findElement(By.xpath("//a[@class='btn btn-register']")).sendKeys(Keys.RETURN);
		element= driver.findElement(By.xpath("//a[@class='btn btn-register']"));
		// return type WebElement
		return element;
	}
	public static WebElement demo_pagevisit(WebDriver driver){
		element= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
		// return type WebElement
		return element;
	}
}
