package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagesObjects {
	
	@FindBy(xpathy="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[contains@id,'passwd']")
	WebElement pass;
	
	@FindBy(xpath="//span[contains(., 'Sign in')]")
	WebElement btnSubmit;
	
	public LoginPagesObjects(WebDriver driver) {
		PageFactory,initElemnts(driver, this);
	}
	
	public void validateLogin() {
		email.sendKeys("test5451@gmail.com");
		pass.sendKeys("test5451");
		btnSubmit.click();
	}
}
