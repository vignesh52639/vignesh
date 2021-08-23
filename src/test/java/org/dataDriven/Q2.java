package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2 {

	public static void main(String[] args) throws IOException {

		File data=new File("C:\\Users\\Vignesh\\eclipse-workspace\\maven\\edata\\Book1.xlsx");
		
		FileInputStream view=new FileInputStream(data);
		
		Workbook book= new XSSFWorkbook(view);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		Row ro = sheet.getRow(0);
		
		int cells = ro.getPhysicalNumberOfCells();
		System.out.println(cells);
		
		
	}

}
