package org.testNg;

import java.io.IOException;

import org.Base.BaseClass;
import org.pom.pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q1 extends BaseClass {

	@BeforeClass
	private void openBrowser() {
		loadBrowser();
	}

	@AfterClass
	private void closeBrowser() {
		close();
	}

	@BeforeMethod
	private void startTime() {
		printDateAndTime();
	}
	
	@AfterMethod
	private void endTime() {
		printDateAndTime();
	}
	@Test
	private void test1() throws IOException {
            lanchUrl("https://en-gb.facebook.com/");
            maximize();
            pojo p=new pojo();
            fillTextBox(p.getTxtUser(), getData(1, 0));
            fillTextBox(p.getTxtPass(), getData(1, 1));
            btnclick(p.getBtnlogin());
            
	}
	//hello

}
