package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1 {

	public static void main(String[] args) throws IOException {

		File data = new File("C:\\Users\\Vignesh\\eclipse-workspace\\maven\\edata\\Book1.xlsx");

		FileInputStream viewfile = new FileInputStream(data);

		Workbook book = new XSSFWorkbook(viewfile);

		Sheet sh = book.getSheet("Sheet1");
		

		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				System.out.println(cell);

			}

		}

	}

}
