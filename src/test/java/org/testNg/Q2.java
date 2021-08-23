package org.testNg;

import org.Base.BaseClass;
import org.pom.pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q2 extends BaseClass {

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
		lanchUrl("https://www.redbus.in/");
		maximize();
		dtime();
		pojo p = new pojo();
		btnclick(p.getElementclick());
		btnclick(p.getSignin());
	}

}
