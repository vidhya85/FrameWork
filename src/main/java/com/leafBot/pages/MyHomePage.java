package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyHomePage extends SeleniumBase{
	public LeadsPage clickLeadsLink() {
		//driver.findElementByLinkText("Leads").click();
		//eleLeadsLink.click();
		click(locateElement("link","Leads"));
	return new LeadsPage();
	}
	
	public LeadsPageFindLeads clickLeads() {
		click(locateElement("link","Leads"));
		return new LeadsPageFindLeads();
	}
	
	}


