package com.testng.parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelParameters {
	
	@Test (dataProvider = "getData")
	public void TestCase (String userName, String password, String three, String four) {
		System.out.println("Do an action with the next parameters: " + userName + password);
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		
		File excelFile = new File ("/home/jesus/workspace/TestNGProject/src/test/resources/TestNGParameters.xlsx");
		FileInputStream fileOpened = new FileInputStream (excelFile);
		
		Workbook workbook = WorkbookFactory.create(fileOpened);
		
		Sheet sheet0 = workbook.getSheetAt(0);
		int rowsNumber = sheet0.getLastRowNum();
		
		Row row0 = sheet0.getRow(0);
		Cell cellA = row0.getCell(0);
		
		int columNumber = row0.getLastCellNum();
		Object[][] data = new Object[rowsNumber+1][columNumber];
		
		for(Row row : sheet0) {
			for(Cell cell : row) {
				switch (cell.getCellType()){
				case STRING:
					System.out.println(cell.getStringCellValue()+"\t");
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue()+"\t");
					break;
				case BLANK:
					System.out.println("The cell is blank"+"\t");
					break;
				}
			}
		}
		
		System.out.println(cellA);
		
		fileOpened.close();
		return data;
	}
}
