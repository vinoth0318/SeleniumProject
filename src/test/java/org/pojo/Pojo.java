package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pojo extends BaseClass {
	
	// 1. Non PArameterized Constructor
	public Pojo() {
		PageFactory.initElements(driver, this);
	}

	// 2. Private WebElements
	// WebElement email = driver.findElement(By.id("email"));
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@class='inputtext _55r1 _6luy _9npi']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;

	// 3. Getter to access WebElements outside the class
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
