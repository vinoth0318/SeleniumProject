package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbCreateAcPojo extends BaseClass {
	
	public FbCreateAcPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement createAccount ;
	
	@FindBy(xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")
	private WebElement firstName ;
	
	@FindBy(name = "lastname")
	private WebElement surName ;
	
	@FindBy(name = "reg_email__")
	private WebElement email ;
	
	@FindBy(name = "reg_passwd__")
	private WebElement password ;

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	
}
