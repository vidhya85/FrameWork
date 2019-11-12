package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName="TC002";
		testcaseName="Create Lead";
		testcaseDec = "Create Lead in Leaftaps";
		author="Vidhya";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String cName, String fName,String lName) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin().clickCRMLink().clickLeadsLink().clickCreateLead().enterCompanyName(cName).enterFirstName(fName)
		.enterLastName(lName).clickCreateLeadButton().viewLead(fName);		
	}

}
