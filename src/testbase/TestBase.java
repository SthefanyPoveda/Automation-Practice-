package testbase;

import seleniumimplementacion.SeleniumImplemetation;

public class TestBase extends SeleniumImplemetation{
	
	public void launchApplication() {
	openURL("http://automationpractice.com/index.php");
	}

}
