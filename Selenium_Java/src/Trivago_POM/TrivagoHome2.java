package Trivago_POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils2.AutoSugest;

public class TrivagoHome2 extends AutoSugest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public int txt;
	
	By search=By.id("horus-querytext");

	public TrivagoHome2(WebDriver driver) throws Exception 
	{
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 180);
	}
	
	

	public void GoToHomePage(String xyz) {
		// TODO Auto-generated method stubdriver.get(URL);
		driver.get(xyz);
		driver.manage().window().maximize();
		
	}
	
	//public  void Date() throws Exception
		public  void Date(String mon,String mon1, String frmd, String tod ) throws Exception
	{
		
		System.out.println("data"+mon+mon1+frmd+tod);
		driver.findElement(search).sendKeys(Keys.ENTER);
		//Thread.sleep(3000);
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(search));
		System.out.println("Date1");
		
		/*	WebDriverWait w1 = new WebDriverWait(driver, 5);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//time[@datetime='2018-05-01']")));
		
		driver.findElement(By.xpath("//time[@datetime='2018-05-01']")).click();
		System.out.println("Date2");
		
		driver.findElement(By.xpath("//time[@datetime='2018-05-02']")).click(); */
		//driver.findElement(By.xpath("//span[@class='icon-ic btn-horus__icon icon-rtl']")).click();
		
			txt = driver.findElements(By.xpath("//th[@id='cal-heading-month']")).size();
		
		
			if (!(txt==0))
			{
				
			while(!driver.findElement(By.xpath("//th[@id='cal-heading-month']")).getText().contains(mon))
						{
							driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
						} 

		
		/*while (!driver.findElement(By.cssSelector("[class='cal-month']th[class='cal-heading-month']")).getText().contains("May "))
		{
			driver.findElement(By.cssSelector("[class='df_overlay']time[class='cal-day cal-is-selectable']")).click();
		}*/
		
		Thread.sleep(3000);
		
	
			

		List<WebElement> dates = driver.findElements(By.className("cal-day-wrap"));
		int count=driver.findElements(By.className("cal-day-wrap")).size();
		System.out.println(count);
		for(int i = 0;i<count;i++)
		{
			String text = driver.findElements(By.className("cal-day-wrap")).get(i).getText();
			if (text.equalsIgnoreCase(frmd))
			{
				driver.findElements(By.className("cal-day-wrap")).get(i).click();
				break;
			}
		}
		
		//Check-out
		
		while(!driver.findElement(By.xpath("//th[@id='cal-heading-month']")).getText().contains(mon1))
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
			if (text.equalsIgnoreCase(tod))
			{
				driver.findElements(By.className("cal-day-wrap")).get(d).click();
				break;
			}
		}
		
			}
			
			
			
			else 
			{
				while(!driver.findElement(By.xpath("//th[@id='cal-heading-month-first']")).getText().contains("May"))
				{
					driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
				} 
				
				Thread.sleep(3000);
				
				
				//List<WebElement> dates = driver.findElements(By.className("cal-month cal-month--first-month"));
				int count=driver.findElements(By.className("cal-month cal-month--first-month")).size();
				System.out.println(count);
				for(int i = 0;i<count;i++)
				{
					String text = driver.findElements(By.className("cal-month cal-month--first-month")).get(i).getText();
					if (text.equalsIgnoreCase("28"))
					{
						driver.findElements(By.className("cal-month cal-month--first-month")).get(i).click();
						break;
					}
				}
				
				while(!driver.findElement(By.xpath("//th[@id='cal-heading-month-first']")).getText().contains("June"))
				{
					driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
				} 
				
				Thread.sleep(3000);
				
				
				List<WebElement> dates1 = driver.findElements(By.className("cal-month cal-month--second-month"));
				int count3=driver.findElements(By.className("cal-month cal-month--second-month")).size();
				System.out.println(count3);
				for(int i = 0;i<count3;i++)
				{
					String text = driver.findElements(By.className("cal-month cal-month--second-month")).get(i).getText();
					if (text.equalsIgnoreCase("3"))
					{
						driver.findElements(By.className("cal-month cal-month--second-month")).get(i).click();
						break;
					}
				}
				
				
				

			}
				
	    //driver.findElement(By.xpath("//*[@class='horus__col horus__col--roomtype']/button")).click();
		
		System.out.println("RoomType");
		Thread.sleep(3000);
		driver.findElements(By.xpath("//*[@class='df_component df_label']")).get(2).click();
		System.out.println("NumOfAdault");
		Thread.sleep(3000);
		Select s1 = new Select(driver.findElement(By.id("select-num-adults-1")));
		s1.selectByValue("2");
		System.out.println("NumOfChildern");
		Select s2 = new Select(driver.findElement(By.id("select-num-children-1")));
		s2.selectByValue("1");
		System.out.println("NumOfChildernAge");
		Select s3 = new Select(driver.findElement(By.xpath("//*[contains(@id,'select-ages-children-1-')]")));
		s3.selectByValue("3");
		
		driver.findElements(By.className("btn__text")).get(1).click();
		
		
		driver.findElements(By.className("fl-score")).get(4).click();
	
		Select s4 = new Select(driver.findElement(By.id("mf-select-sortby")));
		s4.selectByVisibleText("Distance only");
		
		Thread.sleep(3000);
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
		
		int count1 = 0;
		for(WebElement showHotelNames : FilterHotelNames)
		{
			System.out.println(showHotelNames.getText() + " " + FilterHotelPrices.get(count1).getText().replace("₹", "Rs. "));
			count1++;
		}
		
		
		
		
		
	}



}
	
	
