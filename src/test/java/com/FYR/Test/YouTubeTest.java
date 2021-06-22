package com.FYR.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FYG.baseClass.BaseClass;
import com.FYG.pages.Youtube;
import com.FYG.testData.DataProviderOne;

public class YouTubeTest extends BaseClass{
	
	Youtube youTube;
	DataProviderOne dataProvider;
	
	@Test(dataProvider = "testData")
	public void doSearch(String customer, String value) {
		
		youTube = new Youtube(driver);
		youTube.searchUTube(value);
		
	}
	
	@DataProvider
	public Object[][] testData() throws Exception {
		dataProvider = new DataProviderOne();
		
		Object[][] data = dataProvider.FYGdata("youtube");
		return data;
	}

}
