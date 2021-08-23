package org.testNg;

import org.Base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q8 extends BaseClass{
	
	@BeforeClass
	private void openbrowser() {
		loadBrowser();

	}
 @AfterClass
 private void closebrowser() {
	close();
}
 @BeforeMethod
 private void starttime() {
	printDateAndTime();
}
	@AfterMethod
	private void endTime() {
		printDateAndTime();

	}
	@Test
	private void tc1() {
		lanchUrl("http://www.greenstechnologys.com/");
		
	}

}
