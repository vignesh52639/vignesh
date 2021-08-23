package org.pom;

import org.Base.BaseClass;

public class Q5 extends BaseClass {

	public static void main(String[] args) {
		loadBrowser();
		maximize();
		lanchUrl("http://www.adactin.com/HotelApp/");
		pojo p = new pojo();
        fillTextBox(p.getTxtUser(), "test526390");
        fillTextBox(p.getTxtPass(), "80P8V8");
        
        
	}

}
