package com.FYG.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.FYG.baseClass.BaseClass;

public class GmailForWork extends BaseClass{
	
	By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
	
	public GmailForWork(WebDriver driver) {
		
		this.driver = driver;
	}

	public GmailLogin clickSignIn() {
		
		driver.findElement(signInButton).click();
		return new GmailLogin(driver);
	}
}
