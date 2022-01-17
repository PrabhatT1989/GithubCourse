package TestPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ArrayDemo {
	File f ;
	FileInputStream fis ;

	
	public void readDataFromFile() throws IOException
	{
		
		f= new File("F:\\Test Data\\Registration\\Registration.xlsx");
		fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
	XSSFCell firstrowsecondcell=	sheet.getRow(1).getCell(2);
		System.out.println("File data :" + firstrowsecondcell);
		
		
	}
	
	
	
	
	public static void main(String args[]) throws IOException
	{
		
		
		/*
		 * System.out.print("Hello world"); System.err.println("Error ");
		 * System.in.toString();
		 */
		
		
		ArrayDemo ad = new ArrayDemo();
		
		ad.readDataFromFile();
		
	}

}
