package com.FYR.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FYG.baseClass.BaseClass;
import com.FYG.pages.GmailForWork;
import com.FYG.pages.GmailLogin;
import com.FYG.testData.DataProviderOne;

public class GmailTest extends BaseClass{
	
	GmailForWork gmailForWork;
	GmailLogin gmailLogin;
	DataProviderOne dataProvider;
	
	@Test (dataProvider = "gmailData")
	public void doGmailLogin(String custNo, String userID, String pwd) {
		
		gmailForWork = new GmailForWork(driver);
		gmailLogin = new GmailLogin(driver);
		
		gmailForWork.clickSignIn();
		gmailLogin.doLogin(userID, pwd);
		System.out.println("Login done for "+ custNo+" customer");
	}
	
	@DataProvider
	public Object[][] gmailData() throws Exception {
		
		dataProvider = new DataProviderOne();
		Object[][] data = dataProvider.FYGdata("gmail");
		return data;
	}

}
