import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main (String[] args){
		
		// set property for geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\Selenium\\SeleniumFw\\drivers\\geckodriver\\geckodriver.exe");
		//object create for Fire fox driver
		WebDriver driver =new FirefoxDriver();
		driver.get("https://youtube.com/");
		// access through xpath
		//driver.findElement(By.className("search_query")).sendKeys("WWE");
		//second way
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Wwe");
		
		//One way
		//WebElement textBox =driver.findElement(By.xpath("//input[@id='search']"));
		//textBox.sendKeys("Qamon");
		// for clicking the search box
			driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.RETURN);
				// close browser
		// driver.close();
		
	}

}
