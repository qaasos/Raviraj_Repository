package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) throws Exception {
	
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(3000);
			driver.switchTo().alert().accept(); //positive scenario

	}

}
