package com.FYG.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.FYG.baseClass.BaseClass;

public class GmailLogin extends BaseClass{
	
	By gmailUsers = By.xpath("//input[@type='email']");
	By nextButton = By.xpath("//span[text()='Next']");
	By gmailpwd = By.xpath("//input[@type='password']");
	
	
	public GmailLogin(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void doLogin(String userName, String pwd) {
		
		driver.findElement(gmailUsers).sendKeys(userName);
		driver.findElement(nextButton).click();
		driver.findElement(gmailpwd).sendKeys(pwd);
		driver.findElement(nextButton).click();
	}

}
