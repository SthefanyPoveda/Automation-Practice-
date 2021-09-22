package com.atumationpractice.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.automationpractice.pages.LoginPagesObjects;

public class LoginPageTestScript {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\57350\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\57350\\Downloads\\geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
	}
	
	@Test
	public void validateLogin() {
		LoginPagesObjects page = new LoginPagesObjects(driver);
		page.validateLogin();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
