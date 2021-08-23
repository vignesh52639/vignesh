package org.pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import net.bytebuddy.asm.Advice.This;

public class Q1 extends BaseClass{
        public static void main(String[] args) {
			
        	loadBrowser();
        	maximize();
        	lanchUrl("https://www.facebook.com/");
        	pojo p=new pojo();
        	
        	fillTextBox(p.getTxtUser(), "test123");
        	fillTextBox(p.getTxtPass(), "test@123");
        	btnclick(p.getBtnlogin());
        	
        	
        	
        	
        	
        	
        	
		}
	
}
