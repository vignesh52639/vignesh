package org.pom;

import org.Base.BaseClass;

public class Q25 extends BaseClass{

	public static void main(String[] args) {
		loadBrowser();
		maximize();
		lanchUrl("http://www.greenstechnologys.com/Certifications.html");
		pojo p = new pojo();
		btnclick(p.getElementclick());
		jsscrolldown(p.getTxtscroll());
		System.out.println(p.getTxtscroll().getText());
		System.out.println(p.getPrint().getText());
		
		
	}

}
