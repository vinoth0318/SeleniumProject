package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.When;

public class FlipCartPojo extends BaseClass {
	
	// 1. Non PArameterized Constructor
		public FlipCartPojo() {
			PageFactory.initElements(driver, this);
		}

		// 2. Private WebElements
		// WebElement email = driver.findElement(By.id("email"));
		
		
		@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
		private WebElement email;
		
		@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
		private WebElement password;

		@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		private WebElement login;
		
		// 3. Source ==> generate Getters and Setters
		public WebElement getLogin() {
			return login;
		}

		public WebElement getEmail() {
			return email;
		}
		
		public WebElement getPassword() {
			return password;
		}

	
		
	

		
		
		

		
		
		
		

}
