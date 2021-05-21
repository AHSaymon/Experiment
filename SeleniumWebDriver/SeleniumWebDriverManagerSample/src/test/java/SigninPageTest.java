import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SigninPageTest {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();
	// sign in page
	driver.get("https://nexchar.com/signin");
	// give email & password
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hamidsaymon9@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Abc12345");
	// click submit button
	driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.RETURN);
	//driver.findElement(By.xpath("//span[contains(text(),'Demo')]")).sendKeys(Keys.RETURN);
}
}
