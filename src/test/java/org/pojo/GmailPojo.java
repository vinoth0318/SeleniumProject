package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojo extends BaseClass {
	
	// 1. Non PArameterized Constructor
		public GmailPojo() {
			PageFactory.initElements(driver, this);
		}

		// 2. Private WebElements
		// WebElement email = driver.findElement(By.id("email"));
		@FindBy(id = "identifierId")
		private WebElement email;
		
		@FindBy(xpath = "(//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb'])[2]")
		private WebElement next;
		
		@FindBy(name = "Passwd")
		private WebElement password;
		

		// 3. Getter to access WebElements outside the class
		
		public WebElement getEmail() {
			return email;
		}

		public WebElement getNext() {
			return next;
		}

		public WebElement getPassword() {
			return password;
		}


	
}
