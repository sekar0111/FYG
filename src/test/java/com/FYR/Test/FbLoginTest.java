package com.FYR.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FYG.baseClass.BaseClass;
import com.FYG.pages.FaceBookLogin;
import com.FYG.testData.DataProviderOne;

public class FbLoginTest extends BaseClass{
	
	FaceBookLogin faceBookLogin;
	DataProviderOne dataProvider;
	
	String sheetName = "facebook";
	
	@Test(dataProvider = "facebookLogin")
	public void fbLogin(String customer, String userId, String pwd) {
		
		faceBookLogin = new FaceBookLogin(driver);
		faceBookLogin.login(userId, pwd);
		System.out.println("Login for "+customer+" is done");
	}
	
	@DataProvider(name = "facebookLogin")
	public Object[][] testData() throws Exception {
		
		dataProvider = new DataProviderOne();
		Object data[][] = dataProvider.FYGdata(sheetName);
		return data;		
		
	}

}
