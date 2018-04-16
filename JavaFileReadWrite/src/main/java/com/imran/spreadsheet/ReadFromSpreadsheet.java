package com.imran.spreadsheet;

import java.io.File;
import java.io.FileInputStream;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadFromSpreadsheet {

	 static XSSFRow row;
	   public static void main(String[] args) throws Exception {
	      FileInputStream fis = new FileInputStream(new File("src\\main\\resources\\employeeInfo.xlsx"));
	      
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheetAt(0);
	      Iterator < Row >  rowIterator = spreadsheet.iterator();
	      
	      while (rowIterator.hasNext()) {
	         row = (XSSFRow) rowIterator.next();
	         Iterator < Cell >  cellIterator = row.cellIterator();
	         
	         while ( cellIterator.hasNext()) {
	            Cell cell = cellIterator.next();
	            
	            switch (cell.getCellType()) {
	               case Cell.CELL_TYPE_NUMERIC:
	                  System.out.print(cell.getNumericCellValue() + " \t\t ");
	                  break;
	               
	               case Cell.CELL_TYPE_STRING:
	                  System.out.print(
	                  cell.getStringCellValue() + " \t\t ");
	                  break;
	            }
	         }
	         System.out.println();
	      }
	      fis.close();
	   }

}
