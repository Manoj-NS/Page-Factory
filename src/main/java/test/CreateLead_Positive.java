package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead_Positive extends ProjectSpecificMethods {

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







