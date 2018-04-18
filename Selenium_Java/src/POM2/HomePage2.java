package POM2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage2 {

	public WebDriver driver;
	public WebDriverWait wait;
	
	By search=By.id("horus-querytext");
	By areaname=By.id("horus-querytext");
	
	public HomePage2(WebDriver driver) throws Exception 
	{
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 180);
	}
	public void goToHomePage2(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void textSearch() throws Exception
	{
		driver.findElement(search).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(search).sendKeys(Keys.DOWN);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"horus-querytext\").value;";
		String text = (String) js.executeScript(script);
		
		//driver.findElement(By.id("horus-querytext")).sendKeys(Keys.ENTER);
		
		//Malshej Ghat
		while(!text.equalsIgnoreCase("Malshej Ghat, Pune"))
		{
			driver.findElement(By.id("horus-querytext")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println("text");
			
		}
		driver.findElement(By.id("horus-querytext")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//time[@datetime='2018-04-17']")).click();
		driver.findElement(By.xpath("//time[@datetime='2018-04-19']")).click(); 
		//driver.findElement(By.xpath("//span[@class='icon-ic btn-horus__icon icon-rtl']")).click();
		//driver.findElement(By.xpath("//span[@class='btn-horus__value'")).click();
		
		driver.findElements(By.xpath("//span[@class='df_component df_label']")).get(2).click();
		
    	/*
				
		List<WebElement> rooms = driver.findElements(By.xpath("//span[@class='df_component df_label']"))
				
		for(WebElement E : rooms)
		{  
			
			
			if(E.getText().equalsIgnoreCase("Family Rooms"))
			{
				E.click();
				break;
			}
		}
		
		*/
		
		
		
		Select s1 = new Select(driver.findElement(By.id("select-num-adults-1")));
		s1.selectByValue("2");
		
		Select s2 = new Select(driver.findElement(By.id("select-num-children-1")));
		s2.selectByValue("1");
		
		Select s3 = new Select(driver.findElement(By.id("select-ages-children-1-77")));
		s3.selectByValue("3");
		
		//driver.findElement(By.xpath("//span[@class='btn__text']")).click();
		
		
		driver.findElements(By.className("btn__text")).get(1).click();
		
		
		driver.findElements(By.className("fl-score")).get(4).click();
	
		Select s4 = new Select(driver.findElement(By.id("mf-select-sortby")));
		s4.selectByVisibleText("Distance only");
		
		List<WebElement> HotelNames = driver.findElements(By.tagName("h3"));
		List<WebElement> FilterHotelNames = new ArrayList<WebElement>();
		for(WebElement E : HotelNames)
		{  
			if(!E.getText().equals(""))
			{
		//	System.out.println(E.getText());
			FilterHotelNames.add(E);
			}
					
		}
		
		//System.out.println(FilterHotelNames.size());
		
		List<WebElement> HotelPrices= driver.findElements(By.cssSelector(".item__best-price"));
		List<WebElement> FilterHotelPrices = new ArrayList<WebElement>();
		for(WebElement E : HotelPrices)
		{  
			if(!E.getText().equals(""))
			{ //System.out.println(E.getText());
			FilterHotelPrices.add(E);
			}
		}
		
		//System.out.println(FilterHotelPrices.size());
		
		int count = 0;
		for(WebElement showHotelNames : FilterHotelNames)
		{
			System.out.println(showHotelNames.getText() + " " + FilterHotelPrices.get(count).getText().replace("₹", "Rs. "));
			count++;
		}
		
		
		
		
	//	driver.close();
		
	}
	
}
