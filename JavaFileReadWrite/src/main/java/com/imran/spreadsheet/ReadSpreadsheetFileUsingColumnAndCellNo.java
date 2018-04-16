package com.imran.spreadsheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSpreadsheetFileUsingColumnAndCellNo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("src\\main\\resources\\employeeInfo.xlsx");		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		
		String mobileNumber = String.valueOf(cell.getNumericCellValue());
		System.out.println("Result: "+mobileNumber);
		
		
		
		

	}

}
