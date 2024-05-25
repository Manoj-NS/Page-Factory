package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import base.ProjectSpecificMethods;



public class WelcomePage extends ProjectSpecificMethods{
	public WelcomePage(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
	
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText(property.getProperty("welcomPage.crmsfa.linkText"))).click();	
		return new HomePage(driver);
	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
}
