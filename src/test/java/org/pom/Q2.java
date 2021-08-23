package org.pom;

import org.Base.BaseClass;

public class Q2 extends BaseClass {

	public static void main(String[] args) {
		loadBrowser();
		maximize();
		lanchUrl("http://www.greenstechnologys.com/");
		pojo p = new pojo();

		jsscrolldown(p.getTxtscroll());
		System.out.println(p.getTxtscroll().getText());
		jsscrollup(p.getTxtscroll());
		System.out.println(p.getTxtscroll().getText());
		dtime();
		btnclick(p.getElementclick());
		System.out.println(p.getPrint().getText());
		System.out.println(p.getPrint2().getText());
			

	}

}
