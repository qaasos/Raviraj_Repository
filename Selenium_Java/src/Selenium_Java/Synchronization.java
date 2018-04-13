package Selenium_Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Synchronization {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("disable-extensions");
		options.addArguments("incognito");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='icon icon-hotels']")).click();
		
		driver.findElement(By.xpath("//input[@id='hotel-destination']")).sendKeys("NYC");
		driver.findElement(By.xpath("//input[@id='hotel-destination']")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//input[@id='hotel-destination']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("hotel-checkin")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-WestHouse')]")).click();	
		
		
		

	}

}
