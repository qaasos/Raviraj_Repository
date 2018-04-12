package Selenium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); //Used to validate pagetitle is correct
		
		System.out.println(driver.getCurrentUrl());// Landed to correct url or not.
		
		// driver.get("http://yahoo.com");
		driver.navigate().to("http://yahoo.com");
	//	driver.navigate().back();
	//	driver.navigate().forward();
		driver.close(); // It closes the current browser
		
	}

}
