import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtChrome {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\Selenium2\\Sele\\drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://nexchar.com/");
		driver.close();
	}
}
