package seleniumimplementacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SeleniumImplemetation implements SeleniumMethods{

	protected WeDriver driver;
	@Override
	public void click(WebElement element) {
		// TODO Auto-generated method stub
		element.click();
	}

	@Override
	public void setupWebDriverForTesting(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver=driver;
	
	}

	@Override
	public void openURL(String url) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\57350\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
