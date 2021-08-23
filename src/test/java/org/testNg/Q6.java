package org.testNg;

import java.io.IOException;

import org.Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pom.pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Q6 extends BaseClass {
WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	private void openbrowsers(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			loadBrowser();
		} else if (browser.equalsIgnoreCase("firefox")) {
			loadfirefox();
		}

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
	private void tc1() throws InterruptedException, IOException {
		lanchUrl("https://www.flipkart.com/account/login");
		pojo p=new pojo();
		fillTextBox(p.getTxtscroll(), getData(1, 0));
		fillTextBox(p.getTxtscroll(), getData(1, 1));
		stime();
		

	}

}
