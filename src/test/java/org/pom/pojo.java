package org.pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class pojo extends BaseClass {
	public pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtUser;

	@FindBy(id="pass")
	private WebElement txtPass;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement btnlogin;

	@FindAll({ @FindBy(id = "signInLink") })
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}

	@FindAll({ @FindBy(xpath = "//strong[text()='COMPLETE PRACTICAL TRAINING']"),
		@FindBy(xpath="(//input[@type='text'])[2]"),
		@FindBy(xpath="//input[@type='password']"),
			@FindBy(xpath = "//h1[text()='No 1 Software Training Institutes in Chennai with Placements']"),
			@FindBy(xpath = "(//a[text()='contact@greenstechnologys.com'])[8]"),
			@FindBy(xpath = "(//li[text()='+91 8939 915 577 '])[8]") })

	private WebElement txtscroll;

	@FindAll({ @FindBy(id = "i-icon-profile"), @FindBy(xpath = "//a[text()='Certifications']"),
			@FindBy(xpath = "//a[text()='COURSES']"), @FindBy(xpath = "//a[text()='CAREERS']"),
			@FindBy(xpath = "//a[text()='TESTIMONIALS']")

	})
	private WebElement elementclick;

	@FindAll({

			@FindBy(xpath = "//span[@class='testimonial-content']"),
			@FindBy(xpath = "//p[@style='text-align:justify;color:#aaaaaa;']")

	})
	private WebElement print;

	@FindBy(xpath = "//a[text()='COURSES']")
	private WebElement moveCur;

	public WebElement getMoveCur() {
		return moveCur;
	}

	@FindBys({ @FindBy(xpath = "(//h1[text()='SELENIUM'])[2]") })
	private WebElement print2;

	public WebElement getPrint2() {
		return print2;
	}

	public WebElement getPrint() {
		return print;
	}

	public WebElement getElementclick() {
		return elementclick;
	}

	public WebElement getTxtscroll() {
		return txtscroll;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
