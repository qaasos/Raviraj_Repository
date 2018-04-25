package Selenium_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TrivagoCalendar {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		options.addArguments("disable-infobars");
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://trivago.in");
		driver.manage().window().maximize();
		
		By search = By.id("horus-querytext");
		
		driver.findElement(search).sendKeys("Pune");
		//driver.findElement(search).sendKeys(Keys.DOWN);
		
		//***JAVA SCRIPT FOR AUTOSUGGEST***
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script = "return document.getElementById(\"horus-querytext\").value;";
	
		
		{
			driver.findElement(search).sendKeys(Keys.DOWN);
			String text = (String) js.executeScript(script);
			System.out.println("autosuggest"+text);
			
			
			while(!text.equalsIgnoreCase("Malshej Ghat, Pune"))
			{
					driver.findElement(search).sendKeys(Keys.DOWN);
					text = (String) js.executeScript(script);
					System.out.println("text");
					
					
				}
			driver.findElement(search).sendKeys(Keys.ENTER);
			//return text;
			
		}
		
		int txt = driver.findElements(By.xpath("//th[@id='cal-heading-month']")).size();
		
		if(!(txt==0))
		{
			while(!driver.findElement(By.xpath("//th[@id='cal-heading-month']")).getText().contains("May"))
			{
				driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
			} 
	
		
		List<WebElement> dates = driver.findElements(By.className("cal-day-wrap"));
		int count=driver.findElements(By.className("cal-day-wrap")).size();
		System.out.println(count);
		for(int i = 0;i<count;i++)
		{
			String text = driver.findElements(By.className("cal-day-wrap")).get(i).getText();
			if (text.equalsIgnoreCase("26"))
			{
				driver.findElements(By.className("cal-day-wrap")).get(i).click();
				break;
			}
		}
		
		
		//Check-out
		
				while(!driver.findElement(By.xpath("//th[@id='cal-heading-month']")).getText().contains("May"))
				{
					driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
				} 
				Thread.sleep(3000);
				List<WebElement> dates1 = driver.findElements(By.className("cal-day-wrap"));
				int count3=driver.findElements(By.className("cal-day-wrap")).size();
				System.out.println(count3);
				for(int d = 0;d<count3;d++)
				{
					String text = driver.findElements(By.className("cal-day-wrap")).get(d).getText();
					if (text.equalsIgnoreCase("28"))
					{
						driver.findElements(By.className("cal-day-wrap")).get(d).click();
						break;
					}
				}
				
		}
		
	}

}
