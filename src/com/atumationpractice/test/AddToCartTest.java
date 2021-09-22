package com.atumationpractice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationpractice.pages.CarritoPage;

public class AddToCartTest {
	
	WebDriver driver;
	CarritoPage page;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\57350\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		page = new CarritoPage(driver);
	}
	
	@Test
	public void validateAddToCard() {
		Assert.assertTrue(page.validateAddToCart(driver));
	}
}
