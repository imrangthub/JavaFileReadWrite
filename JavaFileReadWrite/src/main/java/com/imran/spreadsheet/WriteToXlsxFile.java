package com.imran.spreadsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToXlsxFile {

	public static void main(String[] args) throws IOException {
		
        FileInputStream file = new FileInputStream("src\\main\\resources\\employeeInfo.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheetAt(0);  
		
		
		Map<String, Object[]> newData = new HashMap<String, Object[]>();
		newData.put("7", new Object[] { 7d, "Sonya", 75d, "SALES"});
		newData.put("8", new Object[] { 8d, "Kris", 85d, "SALES" }); 
		newData.put("9", new Object[] { 9d, "Dave", 90d, "SALES"});
		
		
		Set<String> newRows = newData.keySet();
		
		int rownum = sheet.getLastRowNum(); 
		    rownum+=1;
		
		 for (String key : newRows) { 
			 
			 Row row = sheet.createRow(rownum++);
			 Object[] objArr = newData.get(key);
			 
			  int cellnum = 0;
			  
			     for (Object obj : objArr) { 
			    	 
			    	 Cell cell = row.createCell(cellnum++); 
			    	 
			    	    if (obj instanceof String) {
			    	    	cell.setCellValue((String) obj);
			    	    	
			    	    } else if (obj instanceof Boolean) { 
			    	       cell.setCellValue((Boolean) obj); 
			    	    		
			    	    } else if (obj instanceof Date) { 
			    	       cell.setCellValue((Date) obj);
			    	    			
			    	    } else if (obj instanceof Double) { 
			    	       cell.setCellValue((Double) obj);			    	    			
			    	    } 			    	    
			      }			     			     
	       }
		 
		// open an OutputStream to save written data into Excel file 
		 FileOutputStream os = new FileOutputStream("src\\main\\resources\\employeeInfo.xlsx"); 
		 book.write(os);
		 System.out.println("Writing on Excel file Finished ..."); 
		 // Close workbook, OutputStream and Excel file to prevent leak 
		 os.close(); 
		 book.close();
		 file.close();

 
		 


	}

}
