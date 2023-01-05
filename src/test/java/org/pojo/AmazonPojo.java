package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{

	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	private WebElement ClickSignin;
	
	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement email;
	
	@FindBy(id = "continue")
	private WebElement ClickContinue;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(id = "signInSubmit")
	private WebElement signin;

	public WebElement getClickSignin() {
		return ClickSignin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getClickContinue() {
		return ClickContinue;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
	
}
