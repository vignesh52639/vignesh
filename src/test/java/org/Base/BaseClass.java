package org.Base;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static final String String = null;
	public static WebDriver driver;
	public static Robot robot;
	public static Actions a;
	public static TakesScreenshot screenShot;
	public static JavascriptExecutor jssetattribute;
	public static JavascriptExecutor jsclick;
	public static Alert alert;
	public static WebDriver frame;
	public static JavascriptExecutor jsscrollup;
	public static JavascriptExecutor jsscrolldown;
	public static Select s;

	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadfirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void loadedge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static String getString() {
		return String;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static Robot getRobot() {
		return robot;
	}

	public static Actions getA() {
		return a;
	}

	public static TakesScreenshot getScreenShot() {
		return screenShot;
	}

	public static JavascriptExecutor getJssetattribute() {
		return jssetattribute;
	}

	public static JavascriptExecutor getJsclick() {
		return jsclick;
	}

	public static Alert getAlert() {
		return alert;
	}

	public static WebDriver getFrame() {
		return frame;
	}

	public static JavascriptExecutor getJsscrollup() {
		return jsscrollup;
	}

	public static JavascriptExecutor getJsscrolldown() {
		return jsscrolldown;
	}

	public static Select getS() {
		return s;
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void lanchUrl(String url) {
		driver.get(url);
	}

	public static void getUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	}

	public static void gettitle() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}

	public static void substring(WebElement element) {
		substring(element);

	}

	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void btnclick(WebElement ref) {
		ref.click();
	}

	public static void gettext(WebElement ref) {
		System.out.println(ref.getText());

	}

	public static void getsize(WebElement size) {
		size.getSize();
	}

	public static void gettag(WebElement ref) {
		ref.getTagName();

	}

	public static void getAttribute(WebElement attri, String value) {
		String attribute = attri.getAttribute(value);
		System.out.println(attribute);

	}

	public static void robot() throws AWTException {
		robot = new Robot();

	}

	public static void copy() {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
	}

	public static void paste() {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	}

	public static void drag(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();

	}

	public static void move(WebElement src) {
		a.moveToElement(src).perform();
	}

	public static void sshot(String image) throws IOException {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Vignesh\\eclipse-workspace\\Selenium\\Screenshots\\ " + image + ".png");
		FileUtils.copyFile(src, des);

	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();

	}

	public static void jssetattribute(String data, WebElement ref) {
		JavascriptExecutor jssetattribute = (JavascriptExecutor) driver;
		jssetattribute.executeScript("arguments[0].setAttribute('value', '" + data + "')", ref);
	}

	public static void jsclick(WebElement ref) {
		JavascriptExecutor jsclick = (JavascriptExecutor) driver;
		jsclick.executeScript("arguments[0].click()", ref);

	}

	public static void jsscrollup(WebElement ref) {
		JavascriptExecutor jsscrollup = (JavascriptExecutor) driver;
		jsscrollup.executeScript("arguments[0].scrollIntoView(true)", ref);

	}

	public static void jsscrolldown(WebElement ref) {
		JavascriptExecutor jsscrolldown = (JavascriptExecutor) driver;
		Object script = jsscrolldown.executeScript("arguments[0].scrollIntoView(false)", ref);

	}

	public static void alert() {
		Alert alert = driver.switchTo().alert();

	}

	public static void frame(int arg0) {
		WebDriver frame = driver.switchTo().frame(arg0);

	}

	public static void dtime() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void stime() throws InterruptedException {
		Thread.sleep(2000);

	}

	public static void selectbyindex(WebElement ref, int index) {
		Select s = new Select(ref);
		s.selectByIndex(index);
	}

	public static String getData(int rownum, int colnum) throws IOException {
		File file = new File("C:\\\\Users\\\\Vignesh\\\\eclipse-workspace\\\\maven\\\\edata\\\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sheet = book.getSheet("Sheet3");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(colnum);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();

		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("MM-dd-yyyy");
				value = sd.format(d);
			} else {
				double n = cell.getNumericCellValue();
				long l = (long) n;
				value = String.valueOf(l);

			}
		}
		return value;

	}

	public static void switchwindow() {
		Set<String> window = driver.getWindowHandles();
		int c = 0;
		for (String eachid : window) {
			if (c == 1) {
				driver.switchTo().window(eachid);
			}
			c++;

		}
	}

	public static void test1(String Exlname, String sheetname, int rownum, int column, String cellvalue)
			throws IOException {
		File file = new File("C:\\\\Users\\\\Vignesh\\\\eclipse-workspace\\\\maven\\\\edata\\\\" + Exlname + ".xlsx");
		// FileInputStream fin2 = new FileInputStream(file);
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet(sheetname);
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(column);
		cell.setCellValue(cellvalue);
		FileOutputStream fout = new FileOutputStream(file);
		book.write(fout);

	}

	public static void addrow(String sheetname, int rownum, int column, String cellvalue) throws IOException {
		File file = new File("C:\\\\Users\\\\Vignesh\\\\eclipse-workspace\\\\maven\\\\edata\\\\test.xlsx");
		FileInputStream fin2 = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fin2);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.createRow(rownum);
		Cell cell = row.createCell(column);
		cell.setCellValue(cellvalue);
		FileOutputStream fout = new FileOutputStream(file);
		book.write(fout);

	}

	public static void printDateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}

}
