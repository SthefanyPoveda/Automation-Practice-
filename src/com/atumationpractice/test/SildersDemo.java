package com.atumationpractice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SildersDemo {
	
	Actions action;
	public void move(boolean isLRigth, int noOfMoves, WebDriver driver) {
		action = new Actions(driver);
		
		if(isLRigth) {
			for(int i=0; i<noOfMoves; i++) {
			action.sendKeys(Keys.ARROW_RIGHT).build().perform();
			}
		}
		else {
			for(int i=0; i<noOfMoves; i++) {
			action.sendKeys(Keys.ARROW_LEFT).build().perform();
			}
		}
			
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\57350\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		
		WebElement leftSlider = driver.findElement(By.xpath("//*[@id=\"layared_price_slider\"]/a[1]"));
		leftSlider.click();
		
		SildersDemo demo = new SildersDemo();
		demo.move(true, 5, driver);
		
		WebElement priceElement = driver.findElement(By.xpath("//*[@id=\"layared_price_range\"]"));
		String priceText=priceElement.getText().substring(0,6);
		
		System.out.println(priceText);
		String ExpectedText="$17.85";
		
		if(priceText.equals(ExpectedText)) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Fallido");
		}
	}
}
