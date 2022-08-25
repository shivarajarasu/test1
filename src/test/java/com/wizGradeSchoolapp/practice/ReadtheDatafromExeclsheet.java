package com.wizGradeSchoolapp.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadtheDatafromExeclsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1: read the file using file input stream
		FileInputStream fis = new FileInputStream(".\\Data\\tyssss.xlsx");
		//step 2:Create workbook
		Workbook workbook = WorkbookFactory.create(fis);
		//step 3:load the sheet
		Sheet sh = workbook.getSheet("sheet1");
		//step 4: navigate to the row
		Row row = sh.getRow(1);
		//step 5: navigate to the cell
		Cell cel = row.getCell(0);
		//step 6: read the value inside the cell
		System.out.println(cel.getStringCellValue());
		
		
	
		

	}

}
