package Selenium_Java;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		System.out.println(driver.findElements(By.className("day")).size());
		
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("3"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
		

	}

}
