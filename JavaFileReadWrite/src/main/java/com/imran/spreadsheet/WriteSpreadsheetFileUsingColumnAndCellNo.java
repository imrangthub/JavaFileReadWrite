package com.imran.spreadsheet;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSpreadsheetFileUsingColumnAndCellNo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
	

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("pageOne");
		XSSFRow row = sheet.createRow(10);
		XSSFCell cell = row.createCell(10);
		
		cell.setCellValue("Cell Value One");
		
		
		workbook.write(new FileOutputStream("src\\main\\resources\\SimpleWriteToSpreadsheetFileOutPutFile.xlsx"));
		
		
		
        System.out.println("Successfullu complete");
	}

}
