package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		//driver.findElements(By.xpath("//input[@name='group1']")).get(0).click();
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i=0;i<=count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
		
		
	}

}
