package com.imran.spreadsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSpreadsheetFileByColumnName {

	public static void main(String[] args) throws IOException {
		
		

		FileInputStream file = new FileInputStream("src\\main\\resources\\employeeInfo.xlsx");		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		
		int colNum = -1;
		
		for(int i=0; i<row.getLastCellNum(); i++) {
			if(row.getCell(i).getStringCellValue().trim().equals("NAME")) {
				colNum = i;
			}
		}
		
		row = sheet.getRow(4);
		cell = row.getCell(colNum);	
		
		
		String userName = String.valueOf(cell.getRichStringCellValue());
		System.out.println("Result: "+userName);
		

	}

}
