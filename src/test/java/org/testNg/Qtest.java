package org.testNg;

import org.Base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Qtest extends BaseClass {

	@AfterClass
	private void closebrowser() {
		close();
	}

	@Test
	private void tc1() {
		loadBrowser();
		lanchUrl("http://www.greenstechnologys.com/");
		//maximize();
	}
	
		
	@Test
	private void tc2() {
          loadedge();
          lanchUrl("http://www.greenstechnologys.com/");
         // maximize();
	}

	@Test
	private void tc3() {
		loadfirefox();
		lanchUrl("http://www.greenstechnologys.com/");
		//maximize();
	}

}
