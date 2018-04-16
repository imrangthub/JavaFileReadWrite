package com.imran.spreadsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromXlsxFile {

	public static void main(String[] args) throws IOException {

//		File myFile = new File("C://temp/Employee.xlsx"); FileInputStream fis = new FileInputStream(myFile);
		
		FileInputStream file = new FileInputStream("src\\main\\resources\\employeeInfo.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheetAt(0);
		Iterator<Row> itr = sheet.iterator();
		// Iterating over Excel file in Java 
		while (itr.hasNext()) { Row row = itr.next(); 
		// Iterating over each column of Excel file 
		Iterator<Cell> cellIterator = row.cellIterator();
		
		while (cellIterator.hasNext()) { 
			
			Cell cell = cellIterator.next(); 
			
			switch (cell.getCellType()) { 
			
			case Cell.CELL_TYPE_STRING:
				System.out.print(cell.getStringCellValue() + "\t"); 
			break; 
			case Cell.CELL_TYPE_NUMERIC:
				System.out.print(cell.getNumericCellValue() + "\t");
			break;
			case Cell.CELL_TYPE_BOOLEAN: 
				System.out.print(cell.getBooleanCellValue() + "\t");
			break; 
			default:
				} 
			} System.out.println("");
			
		}

	}

}
