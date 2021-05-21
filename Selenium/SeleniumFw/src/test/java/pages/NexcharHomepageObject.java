package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NexcharHomepageObject {
	
	// WebDriver called
	WebDriver driver= null;
	
	// alternative of findElement
	By signup_pagevisit= By.xpath("//a[@class='btn btn-register']");
	By demo_pagevisit= By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]");
	
	public NexcharHomepageObject(WebDriver driver){
		// for calling everywhere
		this.driver=driver;
	}
	
	// creating the action
	public void clickSignUpButton(){
		driver.findElement(signup_pagevisit).click();;
	}
	
	public void clickdemopage(){
		driver.findElement(demo_pagevisit).click();
	}

}
