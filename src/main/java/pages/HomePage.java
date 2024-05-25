package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import base.ProjectSpecificMethods;



public class HomePage extends ProjectSpecificMethods{
	public HomePage(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
	
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}

}
