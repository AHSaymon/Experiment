package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		youtubeSearch();
		
	}
	public static void youtubeSearch(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\Selenium\\SeleniumFw\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Wwe");
		driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.RETURN);
		
		
	}
}
