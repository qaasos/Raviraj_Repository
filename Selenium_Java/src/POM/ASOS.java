package POM;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import utils.DriverUtils;



public class ASOS 
{
	public static void main (String[] args) throws Exception
	{
		WebDriver driver = null;
		Properties Po= new Properties();
		DriverUtils DU = new DriverUtils();
		
Po.load(new FileInputStream(new File(System.getProperty("user.dir") +"\\config\\config.properties")));
		
		driver = DU.getDriver(Po.getProperty("Browser"));
		
		HomePage HP = new HomePage(driver);
		Filter_Page FA =new Filter_Page(driver);
		JacketDetails JD= new JacketDetails(driver);
		CheckOutPage CP = new CheckOutPage(driver);
				
		
		HP.goToHomePage(Po.getProperty("URL"));
		HP.HoverOnWomenAndClickOnJacket();
		
		FA.ClickOnFilterColor(Po.getProperty("JacketColor"));
		//FA.SortByNewNess("date");
		
		FA.FILTERBYPRICE();
		FA.ClickOnMediumPriceJacket();
		JD.ClickonAddTocart();
		JD.ClickOnViewCart();
		JD.ClickOnProceedToCheckOut();
		CP.EnterDetailsOnCheckOutPage();
	}
	
}
