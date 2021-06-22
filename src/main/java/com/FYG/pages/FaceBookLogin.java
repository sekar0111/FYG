package com.FYG.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.FYG.baseClass.BaseClass;

public class FaceBookLogin extends BaseClass {
	
	
	// WebElements (Object Repository)
	By fbUserID = By.xpath("//input[@class='inputtext _55r1 _6luy' and @type='text']");
	
	By fbPwd = By.xpath("//input[@type='password']");
	
	By fbLogin = By.xpath("//button[@name='login']");
	
	
	// Constructor
	public FaceBookLogin(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	// Actions
	public void login(String user, String pwd) {
		
		driver.findElement(fbUserID).sendKeys(user);
		driver.findElement(fbPwd).sendKeys(pwd);
		
		driver.findElement(fbLogin).click();
		
	}

}
