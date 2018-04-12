package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://Rediff.com");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Ravi");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		//driver.findElement(By.cssSelector("input#submit")).click();
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		

	}

}
