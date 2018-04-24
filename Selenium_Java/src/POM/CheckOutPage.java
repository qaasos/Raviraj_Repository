package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage 
{
	
	public WebDriver driver;
	public WebDriverWait Wait;
	
	public CheckOutPage(WebDriver driver)
			
	{
		this.driver = driver;
		Wait = new WebDriverWait(this.driver, 180); 
	}
	
	public void EnterDetailsOnCheckOutPage() throws InterruptedException
	{
		driver.findElement(By.id("billing_first_name")).sendKeys("Ravi");
        driver.findElement(By.id("billing_last_name")).sendKeys("Panchabhai");
        driver.findElement(By.id("billing_email")).sendKeys("ravi@gmail.com");
        driver.findElement(By.id("billing_phone")).sendKeys("97635564525");
        driver.findElement(By.id("billing_address_1")).sendKeys("Katraj, Pune");
        driver.findElement(By.id("billing_city")).sendKeys("Pune");
        
        
        driver.findElement(By.xpath("//*[@id='select2-chosen-2']")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]/div")).click();  
        
        driver.findElement(By.id("billing_postcode")).sendKeys("411046");
        
     
        driver.findElement(By.name("ship_to_different_address")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='terms']")).click();
       // driver.findElement(By.xpath("//p[@class='form-row terms wc-terms-and-conditions woocommerce-validated']/input")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.id("place_order")).click();
        
        
        
	}

}
