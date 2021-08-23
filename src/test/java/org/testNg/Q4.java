package org.testNg;

import java.io.IOException;

import org.Base.BaseClass;
import org.pom.pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q4 extends BaseClass {
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
	private void tc1() throws IOException {
		lanchUrl("https://www.flipkart.com/account/login");
		maximize();
		dtime();
		pojo p = new pojo();
		fillTextBox(p.getTxtUser(), getData(1, 0));
		fillTextBox(p.getTxtPass(), getData(1, 1));
		btnclick(p.getBtnlogin());
		
		
	}

}
