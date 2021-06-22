package com.FYG.baseClass;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public WebDriver driver;
	WebDriverWait eWait;
	FileInputStream file;
	Properties prop;
	
	@BeforeMethod
	@Parameters({"browser", "URL"})
	public void setUP(@Optional("chrome")String browser, @Optional("Gmail")String URL) throws Exception {

		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Documents\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sathish\\Documents\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		file = new FileInputStream("./config.properties");
		prop = new Properties();
		prop.load(file);
		driver.get(prop.getProperty(URL));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		eWait = new WebDriverWait(driver, 5);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
}
