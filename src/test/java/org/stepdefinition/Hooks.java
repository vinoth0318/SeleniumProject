package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before(order = 1)
	// precondition
	private void precondition2() {
		launchBrowser();
		System.out.println("launch the browser");
	}
	@Before(order = 2)
	private void precondition1() {
		
		windowMaximize();
		System.out.println("maximize the window");
	}
	@Before(order = 3 , value = "@Smoke")
	private void precondition3() {
		System.out.println("precondition3");
	}
	
	@After(order = 5 , value = "@Smoke")
	// postcondition
	private void postcondition4() {
		System.out.println("Take Screenshot of scenarios");
	}
	@After(order = 4)
	private void postcondition5() {
		closeEntireBrowser();
		System.out.println("close the browser");
	}
	
}
