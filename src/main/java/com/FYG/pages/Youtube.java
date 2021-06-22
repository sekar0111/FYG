package com.FYG.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.FYG.baseClass.BaseClass;

public class Youtube extends BaseClass{

	By searchBox = By.xpath("//input[@id='search']");
	
	public Youtube(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void searchUTube(String value) {
		
		driver.findElement(searchBox).sendKeys(value);
	}
}
