package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class demo1 {

	Workbook s=null;
	org.apache.poi.ss.usermodel.Sheet sheet=null;
	@Test
	public void m() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	FileInputStream file=new FileInputStream("D:\\testdata.xlsx");
	
	Workbook s=WorkbookFactory.create(file);
	
	 sheet=s.getSheet("a");
	 
	 Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	 
	 for(int i=0;i<sheet.getLastRowNum(); i++)
	 {
		 for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
		 {
			 data[i][k]=sheet.getRow(i+1).getCell(k).toString();
		 }
			 }
	 
	 
	 for(int i=0;i<sheet.getLastRowNum(); i++)
	 {
		 for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
		 {
			System.out.println(data[i][k]);
			
		 }
			 }
	 
	 
	 
	
	 
}}
