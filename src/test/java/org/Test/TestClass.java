package org.Test;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestClass extends BaseClass {

	public static void main(String[] args) {

		loadBrowser();
		maximize();
		lanchUrl("https://www.facebook.com/");
		getUrl();
		gettitle();
		jsscrolldown(driver.findElement(By.xpath("//a[text()='English (UK)']")));
		btnclick(driver.findElement(By.xpath("//a[text()='English (UK)']")));
		jsscrollup(driver.findElement(By.id("email")));
		WebElement email = driver.findElement(By.id("email"));
		fillTextBox(email, "testt@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		fillTextBox(pass, "test@123");
		jsclick(driver.findElement(By.name("login")));
		
        
	}

}
