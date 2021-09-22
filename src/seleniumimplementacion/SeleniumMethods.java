package seleniumimplementacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface SeleniumMethods {
	public void click(WebElement element);
	public void setupWebDriverForTesting(WebDriver driver);
	public void openURL(String url);
}
