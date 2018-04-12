package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com");
WebElement email = driver.findElement(By.id("email"));
WebElement password = driver.findElement(By.name("pass"));

email.sendKeys("raj@gmail.com");
password.sendKeys("sdfsdf");

WebElement login = driver.findElement(By.id("u_0_b"));
login.click();

}

}
