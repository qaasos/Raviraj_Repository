package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("ravi@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		

		
	}

}
