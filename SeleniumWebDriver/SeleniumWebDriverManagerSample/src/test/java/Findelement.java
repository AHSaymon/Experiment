import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelement {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		// Nexchar website in page
		driver.get("https://nexchar.com/");
		
		//contact us page visit
		//driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) header.navbar.navbar-expand-md.d-print-none:nth-child(1) div.container-xl div.collapse.navbar-collapse div.d-flex.flex-column.flex-md-row.flex-fill.align-items-stretch.align-items-md-center ul.navbar-nav li.nav-item:nth-child(4) a.nav-link > span.nav-link-title")).click();
		
		//go to demo page
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		
		//go to sign up page
		driver.findElement(By.xpath("//a[@class='btn btn-register']")).sendKeys(Keys.RETURN);
	}
}
