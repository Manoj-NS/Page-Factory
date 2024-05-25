package test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class CreateLead extends BaseClass{

	@BeforeTest
	public void setData() {
		excelFileName="Login Detail";
		
	}
	
	@Test(dataProvider="createleadData")
	public void test(String username, String password, String companyname, String fname, String lname, String phoneno) {
		
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadButton();
		
		
	}
}






