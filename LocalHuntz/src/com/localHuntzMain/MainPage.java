package com.localHuntzMain;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

	@FindBy(xpath="//a[contains(text(),'New User')]")
	WebElement newUser;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement login;
	
	
	@FindBy(xpath="//a[contains(text(),'Post')]")
	WebElement postAnAdd;
	
	@FindBy(xpath="//body/div[@class='container-fluid']/div[@class='row modal-content']/div[@class='col-sm-12']/form[@id='form1']/div/div/a[4]")
	WebElement faq;
	
	@FindBy(xpath="//form[@id='form1']//div//div//a[@href='Contact%20Us.aspx'][contains(text(),'Contact Us')]")
	WebElement contactUs;
	
	
	public void newUser()
	{
		newUser.click();
	}
	
}
