package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class demo2 {
	
	@Test
	public void m() throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
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
		 
		 
	}

}
