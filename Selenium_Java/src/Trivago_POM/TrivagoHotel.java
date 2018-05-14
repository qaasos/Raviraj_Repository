package Trivago_POM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrivagoHotel {
	public WebDriver driver;
	public WebDriverWait wait;
	public String PriceValue;
	
	//public ArrayList<String> PriceList = new ArrayList();
	public TreeSet<String> PriceList = new TreeSet<String>();
	
	public TrivagoHotel(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ViewDetalClick() throws InterruptedException
	{
		//driver.findElements(By.xpath("//button[@class='btn btn--deal btn--regular icon-bg-icn_arrow_deal fl-trailing']")).get(0).click();
		
		List<WebElement> Prices = driver.findElements(By.xpath("//*[@class ='item__best-details']//strong"));
		
		for(WebElement Pr:Prices){
			
			
			
			PriceValue = Pr.getText();
			//PriceValue = PriceValue.replace("₹", "");
		   // PriceValue = PriceValue.replace("?", "");
			//PriceValue = PriceValue.replace(",", "");
			//System.out.println("Loop"+PriceValue);
			PriceList.add(PriceValue);
			System.out.println("Loop");
		}
		
		System.out.println("Before sort size"+PriceList.size());
		System.out.println("Before sort values"+PriceList);
		PriceList.descendingSet();
        //Collections.sort(PriceList);
		System.out.println("After sort"+PriceList);
		PriceValue = PriceList.first();
		System.out.println("mini PriceValue "+PriceValue);
		Thread.sleep(3000);
		System.out.println("Before click on minimul price");
		//driver.findElement(By.xpath("//*[@class ='item__best-details']//strong[.= '₹"+PriceValue+"']/../../following::button")).click();
		driver.findElement(By.xpath("//*[@class ='item__best-details']//strong[.= '₹"+PriceValue+"']/../following::button")).click();
		
		
	}

	

}
