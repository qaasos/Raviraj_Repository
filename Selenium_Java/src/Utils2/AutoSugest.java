package Utils2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSugest extends DriverUtils2 {
	//static WebDriver driver;
	static By search=By.id("horus-querytext");
	
	public void webdriver (WebDriver driver)
	{
		super.driver = driver;
	}
	
	public static String autoSugest(String c1, String l1) throws InterruptedException
	{
		driver.findElement(search).sendKeys(c1);
		WebDriverWait d = new WebDriverWait(driver, 5);
		d.until(ExpectedConditions.visibilityOfElementLocated(search));
		driver.findElement(search).sendKeys(Keys.DOWN);
		WebDriverWait d1 = new WebDriverWait(driver, 5);
		d1.until(ExpectedConditions.visibilityOfElementLocated(search));
					
					//driver.findElement(By.id("horus-querytext")).sendKeys(Keys.DOWN);
			
		System.out.println("location"+l1);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//String script = "return document.getElementById(\"horus-querytext\").value;";
	String script = "return document.getElementById(\"horus-querytext\").value;";
	System.out.println("script"+script);
	Thread.sleep(2000);
//	String text = (String) js.executeScript(script);
//	System.out.println("text"+text);

	{
		driver.findElement(search).sendKeys(Keys.DOWN);
		String text = (String) js.executeScript(script);
		System.out.println("autosuggest"+text);
		
		
		while(!text.equalsIgnoreCase(l1))
		{
				driver.findElement(search).sendKeys(Keys.DOWN);
				text = (String) js.executeScript(script);
				System.out.println("text");
				
				
			}
		return text;
		
	}
	
	}
	
}
