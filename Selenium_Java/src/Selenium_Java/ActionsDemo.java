package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("disable-extensions");
		options.addArguments("incognito");
		
		
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

	}

}
