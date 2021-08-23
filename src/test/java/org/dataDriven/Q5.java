package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.Base.BaseClass;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q5 extends BaseClass {

	public static void main(String[] args) throws IOException {

		loadBrowser();
		maximize();
		lanchUrl("http://adactinhotelapp.com/");
		File file = new File("C:\\\\Users\\\\Vignesh\\\\eclipse-workspace\\\\maven\\\\edata\\\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet("Sheet2");
		Row row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("username");
		row0.createCell(1).setCellValue("password");
		Row row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("vignesh526390");
		row1.createCell(1).setCellValue("test@123");
		FileOutputStream fout = new FileOutputStream(file);
		book.write(fout);
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		fillTextBox(user, getData(1, 0));
		fillTextBox(pass, getData(1, 1));
		btnclick(driver.findElement(By.id("login")));

	}

}
