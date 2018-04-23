package TrivagoMain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import POM2.HomePage2;
import Trivago_POM.TrivagoHome;
import Trivago_POM.TrivagoHome2;
import Trivago_POM.TrivagoHotel;
import Trivago_POM.getExcelData;
import Utils2.AutoSugest;
import Utils2.DriverUtils2;



public class TrivagoMain  {

	public static void main(String[] args) throws Exception, IOException {
		
		WebDriver driver = null;
		Properties Po2= new Properties();
		DriverUtils2 DU2 = new DriverUtils2();
		
		Po2.load(new FileInputStream(new File(System.getProperty("user.dir") +"\\config\\config1.properties")));

		driver = DU2.getDriver(Po2.getProperty("Browser"));
		

		//TrivagoHome TH = new TrivagoHome(driver);
		//TH.GoToHomePage(Po2.getProperty("URL"));
		
		TrivagoHome2 TH2 = new TrivagoHome2(driver);
		TH2.GoToHomePage(Po2.getProperty("URL"));
		//TH.TextSearch(Po2.getProperty("City"),Po2.getProperty("Location"));
		
		 String city = getExcelData.getExcelData1(0,0);
		 String location = getExcelData.getExcelData1(1,0);
		 AutoSugest.autoSugest(city,location);
		 
		 String month = getExcelData.getExcelData1(2,0);
		 System.out.println(month);
		 String month1 = getExcelData.getExcelData1(3,0);
		 System.out.println(month1);
		 String frmDate = getExcelData.getExcelData1(4,0);
		 System.out.println(frmDate);
		 String toDate = getExcelData.getExcelData1(5,0);
		 System.out.println(toDate);
		 
		 
		 
		 
		TH2.Date(month,month1,frmDate,toDate);
		//getExcelData.getExcelData1(0,0);
		
		
		TrivagoHotel TH1 = new TrivagoHotel(driver);
		TH1.ViewDetalClick();
		
		
		
		
		//HP2.goToHomePage2(Po2.getProperty("URL"));
		
		//HP2.textSearch();
		
		
		
		
	}


	}


