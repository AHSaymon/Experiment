package browserOpen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LanuchingB1 {
	
	public static void main(String[] args){
		
		// Firefox browser open
	/* System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\SLAuto\\SF\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://nexchar.com/"); */
		
		// Chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\SLAuto\\SF\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://nexchar.com/");
	}

}
