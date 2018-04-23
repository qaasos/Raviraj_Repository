package Selenium_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell col;
	

	public static void main(String[] args)throws IOException {
		
		
	String value = getCellData(0,0);
	System.out.print(value + " ");
	
	String value1 = getCellData(0,1);
	System.out.println(value1);
		

	}
	
	public static String getCellData(int rownum,int colnum) throws IOException
	{
		fis = new FileInputStream ("D://Data.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet("script");
		row=sheet.getRow(rownum);
		col=row.getCell(colnum);
		return col.getStringCellValue();
	}

}
