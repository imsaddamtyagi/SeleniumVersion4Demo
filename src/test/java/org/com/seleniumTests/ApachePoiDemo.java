package org.com.seleniumTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ApachePoiDemo {
	
	static String filePath = System.getProperty("user.dir") + "/testData/LoanData.xlsx";
	
    @Test(enabled=false)
    public void getIndividualData() throws IOException   
    {
		File Datafile = new File(filePath);
		FileInputStream fis = new FileInputStream(Datafile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("PersonalLoan");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		
		System.out.println(cell);		
		workbook.close();
			
	}
    
    	
    	
        
    }


