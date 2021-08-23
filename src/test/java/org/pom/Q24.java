package org.pom;

import org.Base.BaseClass;

public class Q24 extends BaseClass{

	public static void main(String[] args) {
		loadBrowser();
		maximize();
		lanchUrl("http://www.greenstechnologys.com/Certifications.html");
		pojo p = new pojo();
		btnclick(p.getElementclick());
		String email = p.getTxtscroll().getText();
		System.out.println(email);
		
	}

}
