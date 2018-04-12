package Selenium_Java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassAssignment {

	public static void main(String[] args) throws Exception
	{
		ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-extensions");
        options.addArguments("disable-infobars");
 
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.get("http://Shop.demoqa.com");
		driver.manage().window().maximize();
		
		WebElement women = driver.findElement(By.xpath("//*[@id='menu-item-2213']/a"));
		//driver.findElement(By.xpath("//*[@id='menu-item-2213']/a"));
		
		Actions action = new Actions(driver); 
		action.moveToElement(women).build().perform();
		driver.findElement(By.linkText("Jackets")).click();
		
		Select s2 = new Select(driver.findElement(By.name("filter_color")));
		s2.selectByVisibleText("Black");
		
		WebDriverWait Wait = new WebDriverWait(driver,220);
		
		Select s3 = new Select(driver.findElement(By.name("orderby")));
		s3.selectByVisibleText("Sort by newness");
		
		WebDriverWait Wait1 = new WebDriverWait(driver,220);
		
		WebElement pricebar = driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[1]/span[2]"));
		Actions action1 = new Actions(driver);
        action1.clickAndHold(pricebar).moveByOffset((int) -139, 0).release(pricebar).build().perform();
        driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button")).click();
        
        WebDriverWait Wait2 = new WebDriverWait(driver,220);
        
        driver.findElement(By.linkText("MOUNTAIN PASS PLAIN PADDED JACKET")).click();
        
        driver.findElement(By.xpath("//*[@id='product-2004']/div[1]/div[2]/form/button")).click(); //Add cart button click
        
        driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div[1]/a")).click(); //View button click
        
        driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/a")).click();//Proceed to checkout
        
        driver.findElement(By.id("billing_first_name")).sendKeys("Ravi");
        driver.findElement(By.id("billing_last_name")).sendKeys("Panchabhai");
        driver.findElement(By.id("billing_email")).sendKeys("ravi@gmail.com");
        driver.findElement(By.id("billing_phone")).sendKeys("97635564525");
        driver.findElement(By.id("billing_address_1")).sendKeys("Katraj, Pune");
        driver.findElement(By.id("billing_city")).sendKeys("Pune");
        
              
        
        //driver.findElement(By.xpath("//span[@id='select2-chosen-2']")).click();
        driver.findElement(By.xpath("//*[@id='select2-chosen-2']")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]/div")).click();  
        
        driver.findElement(By.id("billing_postcode")).sendKeys("411046");
        driver.findElement(By.name("ship_to_different_address")).click();
        
        WebDriverWait Wait3 = new WebDriverWait(driver,220);
        
        Thread.sleep(20000);
        driver.findElement(By.xpath("//*[@id='terms']")).click();
        driver.findElement(By.id("place_order")).click();
	}

}
