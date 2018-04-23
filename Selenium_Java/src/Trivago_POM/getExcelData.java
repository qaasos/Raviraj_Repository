package Trivago_POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getExcelData {
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell col;
	
	public static String getExcelData1(int rownum,int colnum) throws IOException
	{
		fis = new FileInputStream ("D://Data.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet("script");
		row=sheet.getRow(rownum);
		col=row.getCell(colnum);
		return col.getStringCellValue();
	}
	

}
