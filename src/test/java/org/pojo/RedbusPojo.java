package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedbusPojo extends BaseClass {
	
	public RedbusPojo() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='fr signin-block  ']")
	private WebElement clkLoginlogo;
	
	@FindBy(xpath = "//li[text()='Sign In/Sign Up']")
	private WebElement clkSignin;
	
	@FindBy(id = "mobileNoInp")
	private WebElement enterMobileno;
	
	@FindBy(xpath = "//div[text()='Facebook'][1]")
	private WebElement connectFacebook;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(name = "pass")
	private WebElement password;
	
	@FindBy(id = "u_0_0_JM")
	private WebElement login;

	public WebElement getClkLoginlogo() {
		return clkLoginlogo;
	}

	public WebElement getClkSignin() {
		return clkSignin;
	}

	public WebElement getEnterMobileno() {
		return enterMobileno;
	}

	public WebElement getConnectFacebook() {
		return connectFacebook;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
