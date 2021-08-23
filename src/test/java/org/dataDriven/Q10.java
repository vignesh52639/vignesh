package org.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.Base.BaseClass;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q10 extends BaseClass{

	public static void main(String[] args) throws IOException {
		loadBrowser();
		maximize();
		lanchUrl("http://adactinhotelapp.com/");
		File file = new File("C:\\\\Users\\\\Vignesh\\\\eclipse-workspace\\\\maven\\\\edata\\\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet("Sheet3");
		Row row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("username");
		row0.createCell(1).setCellValue("password");
		Row row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("test526390");
		row1.createCell(1).setCellValue("80P8V8");
		FileOutputStream fout = new FileOutputStream(file);
		book.write(fout);
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		fillTextBox(user, getData(1, 0));
		fillTextBox(pass, getData(1, 1));
		btnclick(driver.findElement(By.id("login")));
		WebElement a1 = driver.findElement(By.id("location"));
		selectbyindex(a1, 1);
		WebElement a2 = driver.findElement(By.id("hotels"));
		selectbyindex(a2, 2);
		WebElement a3 = driver.findElement(By.id("room_type"));
		selectbyindex(a3, 2);
		WebElement a4 = driver.findElement(By.id("room_nos"));
		selectbyindex(a4, 2);
		fillTextBox(driver.findElement(By.id("datepick_in")), "04/08/2021");
		fillTextBox(driver.findElement(By.id("datepick_out")), "05/08/2021");
		WebElement a5 = driver.findElement(By.id("adult_room"));
		selectbyindex(a5, 2);
		WebElement a6 = driver.findElement(By.id("child_room"));
		selectbyindex(a6, 0);
		btnclick(driver.findElement(By.id("Submit")));
		dtime();
		btnclick(driver.findElement(By.id("radiobutton_0")));
		btnclick(driver.findElement(By.id("continue")));
		WebElement a7 = driver.findElement(By.id("first_name"));
		fillTextBox(a7, getData(2, 0));
		WebElement a8 = driver.findElement(By.id("last_name"));
		fillTextBox(a8, getData(2, 1));
		WebElement a9 = driver.findElement(By.id("address"));
		fillTextBox(a9, getData(3, 0));
		WebElement a10 = driver.findElement(By.id("cc_num"));
		fillTextBox(a10, getData(3, 1));
		WebElement a11 = driver.findElement(By.id("cc_type"));
		selectbyindex(a11, 2);
		WebElement a12 = driver.findElement(By.id("cc_exp_month"));
		selectbyindex(a12, 5);
		WebElement a13 = driver.findElement(By.id("cc_exp_year"));
		selectbyindex(a13, 5);
		WebElement a14 = driver.findElement(By.id("cc_cvv"));
		fillTextBox(a14, getData(4, 0));
		btnclick(driver.findElement(By.id("book_now")));
		WebElement a15 = driver.findElement(By.id("order_no"));
		getAttribute(a15, "value");
		System.out.println(driver.findElement(By.id("order_no")).getAttribute("value"));
		Row row5 = sheet.createRow(5);
		row5.createCell(0).setCellValue("test12");
		
		
		
		
		
		
		
		
		
		
		
	}

}
