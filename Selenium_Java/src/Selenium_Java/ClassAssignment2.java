package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassAssignment2 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-extensions");
        options.addArguments("disable-infobars");
 
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://www.trivago.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("horus-querytext")).sendKeys("Pune");
		

	}

}
