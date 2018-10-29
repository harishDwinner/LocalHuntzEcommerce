package com.LocalHuntzBaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowserConfig()
	{
		
		System.setProperty("webdriver.gecko.driver", "./resource/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void login()
	{
		driver.get("http://localhuntz.com/");
		
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.close();
	}
}
