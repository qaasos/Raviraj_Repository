package POM;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filter_Page {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Select s1;
	public Filter_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ClickOnFilterColor(String JacketColor)
	{
		Select s1 = new Select(driver.findElement(By.name("filter_color")));
		s1.selectByVisibleText(JacketColor);
		WebDriverWait Wait = new WebDriverWait(driver,220);
		
	}
	
	public void FILTERBYPRICE() throws Exception
	{
		WebElement PriceBar = driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		Actions action1 = new Actions(driver);
		action1.clickAndHold(PriceBar).moveByOffset((int) -139, 0).release(PriceBar).build().perform();
		driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button")).click();
		Thread.sleep(3000);
	}
	
	public void ClickOnMediumPriceJacket() throws Exception
	{	
		WebElement we = driver.findElements(By.xpath("//div[@class ='noo-product-thumbnail']//following-sibling::h3")).get(0);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", we);
		Thread.sleep(1000);
		driver.findElements(By.xpath("//div[@class ='noo-product-thumbnail']//following-sibling::h3")).get(1).click();
		Thread.sleep(1000);
	}
	

}
