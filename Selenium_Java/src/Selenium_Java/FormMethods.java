package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormMethods {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("disable-extensions");
		options.addArguments("incognito");
		
		
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		
		
		System.out.println("Before clicking on multicity radio button");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		
		driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();;
		
		System.out.println("After clicking on multicity radio button");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='wallet_card']/div")).getText());
		
		

	}

}
