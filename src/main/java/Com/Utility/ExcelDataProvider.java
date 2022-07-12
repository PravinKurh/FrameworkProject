package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 

{
	XSSFWorkbook xs;

	public ExcelDataProvider() throws IOException
	{
	  String pathexcel = "E:\\DSS\\JavaProgramDSS\\FrameworkProject\\TestData\\Data.xlsx";
	  
	  FileInputStream fis1 = new FileInputStream(pathexcel);
	  
	   xs = new XSSFWorkbook(fis1);
		
	}

	
	public String getDataProvider(String sheet, int row,int cell)
	{
	    return xs.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();	  
	}
	
	
}
