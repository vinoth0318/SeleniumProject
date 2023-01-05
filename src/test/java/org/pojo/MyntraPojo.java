package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class MyntraPojo extends BaseClass {
	
	public MyntraPojo() {
		PageFactory.initElements(driver, this);
	}
	
	

}
