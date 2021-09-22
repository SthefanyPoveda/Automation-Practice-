package com.atumationpractice.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationpractice.pages.HomePageObjects;

import testbase.TestBase;

public class HomePageTestScript extends TestBase {
	
	HomePageObjects page = null;
	
	@BeforeTest
	public void setup() {
		setupWebDriverForTesting(driver);
		launchApplication();
		page = new HomePageObjects(driver);
		
	}
	
	@Test
	public void FistTest() {
		page.validateClick();
		
	}
}
