package org.testNg;

import java.io.IOException;

import org.Base.BaseClass;
import org.pom.pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class task1 extends BaseClass {

	@BeforeClass
	private void openbrowser() {
		loadBrowser();
	}

	@AfterClass
	private void closebrowser() {
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

	@Test(groups = "pepper")
	private void tc1() throws InterruptedException, IOException {
		lanchUrl("https://www.flipkart.com/account/login");
		pojo p = new pojo();
		fillTextBox(p.getTxtscroll(), getData(1, 0));
		stime();

	}

	@Test(groups = "toy")
	private void tc2() throws InterruptedException, IOException {
		lanchUrl("https://www.flipkart.com/account/login");
		pojo p = new pojo();
		fillTextBox(p.getTxtscroll(), getData(1, 0));
		stime();

	}

	@Test(groups = "pepper")
	private void tc3() throws InterruptedException, IOException {
		lanchUrl("https://www.flipkart.com/account/login");
		pojo p = new pojo();
		fillTextBox(p.getTxtscroll(), getData(1, 0));
		stime();

	}

}
