package POM2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import POM2.HomePage2;
import Utils2.DriverUtils2;


public class ASOS2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		Properties Po2= new Properties();
		DriverUtils2 DU2 = new DriverUtils2();
		
		Po2.load(new FileInputStream(new File(System.getProperty("user.dir") +"\\config\\config1.properties")));

		driver = DU2.getDriver(Po2.getProperty("Browser"));
		
		HomePage2 HP2 = new HomePage2(driver);
		HP2.goToHomePage2(Po2.getProperty("URL"));
		HP2.textSearch();
		
		
	}

}
