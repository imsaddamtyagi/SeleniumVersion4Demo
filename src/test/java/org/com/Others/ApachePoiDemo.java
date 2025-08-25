package org.com.Others;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ApachePoiDemo {
	
	
	@Test(enabled=true,dataProvider="GetDataMethod")
	public void GetEntireData(String LoanNo, String Name, String Bank,String Amount)
	{
        System.out.println("Data from excell is: ");
		System.out.println("LoanNo"+"-> "+LoanNo+","+"Name"+"-> "+Name+","+"Bank"+"-> "+Bank+" "+"Amount"+"-> "+Amount);
        System.out.println();	
	}
	
	
	@DataProvider
	Object[][] GetDataMethod() throws IOException
	{
		
		Object[][] DataObject = readExcelFile("PersonalLoan"); //FirstSheetFromExcel
		    return DataObject;
	}
	
	
	
	Object[][] readExcelFile(String firstSheetFromExcel) throws IOException 
	{
		 String ExcelfilePath = System.getProperty("user.dir") + "/testData/"+"//LoanData.xlsx";
		
		File fs = new File(ExcelfilePath);	
	    FileInputStream fis = new FileInputStream(fs);
	    
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheet(firstSheetFromExcel);
                             
	    int totalRows  =  sheet.getLastRowNum()+1; // Real Count = Index+1. 
	    int totalCells =  sheet.getRow(0).getLastCellNum();
	    
	    System.out.print("Total rows in Excel Sheet->"+totalRows);
	    System.out.println(",Total Column->"+totalCells);

	    Object[][] data = new Object[totalRows][totalCells]; 
	    

	    for (int i = 0; i < totalRows; i++) { 
	        XSSFRow row = sheet.getRow(i);  
	        if (row != null) {
	    for (int k = 0; k < totalCells; k++) {
	        XSSFCell cell = row.getCell(k);
	        data[i][k] = (cell != null) ? cell.toString() : "";
	            }
	        }
	    }

	    workbook.close();
	    return data;
	}

	
	  
	
	
	
	
    @Test(enabled=false)
    public void getIndividualData() throws IOException   
    {
		String ExcelfilePath = System.getProperty("user.dir") + "/testData/"+"//LoanData.xlsx";
		File Datafile = new File(ExcelfilePath);
		FileInputStream fis = new FileInputStream(Datafile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("PersonalLoan");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		
		System.out.println(cell);		
		workbook.close();
			
	}
    
    	
    	
        
    }


