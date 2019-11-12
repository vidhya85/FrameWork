package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class LeadsPageFindLeads extends SeleniumBase {
	public FindLeadsPage clickFindLeads() {
		click(locateElement("xpath","//a[text()='Find Leads']"));
		return new FindLeadsPage();
	}

}
