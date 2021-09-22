package com.automationpractice.pages;

import testbase.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FindBy;

public class HomePageObjects extends TestBase {
	@FindBy(xpath="//a[contains@title, 'Women')]")
	WebElement btnWomen;
	
	public HomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void validateClick() {
		click(btnWomen);
	}
}
