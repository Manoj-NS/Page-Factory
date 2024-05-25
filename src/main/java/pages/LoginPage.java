package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import base.ProjectSpecificMethods;
 
public class LoginPage extends ProjectSpecificMethods{
	public LoginPage(RemoteWebDriver inwardDriver) { 
		this.driver=inwardDriver;
	}	
	
	public LoginPage enterUsername(String username) {
		driver.findElement(By.id(property.getProperty("loginPage.username.id"))).sendKeys(username);
		//LoginPage obj=new LoginPage();
		//return obj;
		//return new LoginPage();
		return this;
	}
		
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id(property.getProperty("loginPgae.passward.id"))).sendKeys(password);
		return this;
	}
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className(property.getProperty("loginPage.Login.class"))).click();
		return new WelcomePage(driver);
}
	
	
}
