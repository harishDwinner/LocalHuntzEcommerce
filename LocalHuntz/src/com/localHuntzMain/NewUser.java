package com.localHuntzMain;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUser {

	@FindBy(id="regTxtname")
	WebElement userName;

	@FindBy(id="regTxtemail")
	WebElement userEmail;
	

	@FindBy(id="regTxtpwd")
	WebElement userPass;
	

	@FindBy(id="regTxtmobile")
	WebElement userMobile;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement save;
	
	@FindBy(xpath="//input[@value='cancel']")
	WebElement cancel;
	
	
	public void newUserLogin(String name,String email, String pass,String mobile)
	{
		
		
		userName.sendKeys(name);
		userEmail.sendKeys(email);
		userPass.sendKeys(pass);
		userMobile.sendKeys(mobile);
		save.click();
		
		
	}
	
	
	public void newUserLoginCancel()
	{
		cancel.click();
	}
	
	
}
