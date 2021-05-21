import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[] args){
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		
		// for opening the browser
		driver.get("https://nexchar.com/");
		// for closing the browser
		driver.close();
		
	}
}
