package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q3 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\\\Users\\\\Vignesh\\\\eclipse-workspace\\\\maven\\\\edata\\\\Book1.xlsx");
		FileInputStream fview = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fview);
		Sheet sheet = book.getSheet("Sheet1");
		Row row12 = sheet.createRow(11);
		row12.createCell(0).setCellValue("Student11");
        row12.createCell(1).setCellValue("M.com");
		FileOutputStream fout = new FileOutputStream(file);
		book.write(fout);
		

	}

}
