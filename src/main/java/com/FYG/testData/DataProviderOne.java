package com.FYG.testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.FYG.baseClass.BaseClass;

public class DataProviderOne extends BaseClass{
	
	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	int rowCount, cellCount;
	
	/*
	 * public static void main(String[] args) throws Exception {
	 * 
	 * new DataProviderOne().FYGdata("facebook"); }
	 */
	
	public Object[][] FYGdata(String sheetName) throws Exception {
		
		file = new FileInputStream(".//test data.xlsx");
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		rowCount = sheet.getLastRowNum();
		cellCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount+1][cellCount];
		for (int i=1; i<rowCount+1; i++) {
			
			for (int j=0; j<cellCount;j++) {
				
				data[i][j] = sheet.getRow(i).getCell(j).toString();
				
			}
		}
		return data;
	}

}
