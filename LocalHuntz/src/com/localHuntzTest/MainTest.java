package com.localHuntzTest;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LocalHuntzBaseClass.BaseClass;
import com.LocalHuntztestData.LocalHuntsTestData;
import com.localHuntzMain.MainPage;
import com.localHuntzMain.NewUser;

public class MainTest extends BaseClass {
	
	@Test(priority=1)
	public void localHuntzTest() throws InterruptedException
	{
		System.out.println("Testing Started....!");
		
	}
	
	/*@Test(priority=2)
	public void creatingNewUser() throws InterruptedException
	{
		System.out.println("Creating new User....!");
		
		MainPage mp = PageFactory.initElements(driver, MainPage.class);
		mp.newUser();
		
		NewUser nu = PageFactory.initElements (driver, NewUser.class);
		Thread.sleep(8000);
		
		nu.newUserLogin("varun","varun@gmail.com", "Andhra@300", "78787878");
	
	
	}*/
	
	@Test(priority=2)
	public void creatingNewUser() throws InterruptedException, IOException
	{
		System.out.println("Creating new User....!");
		
		MainPage mp = PageFactory.initElements(driver, MainPage.class);
		mp.newUser();
		
		NewUser nu = PageFactory.initElements (driver, NewUser.class);
		Thread.sleep(8000);
		
		LocalHuntsTestData lt = new LocalHuntsTestData();
		
		Properties data=lt.testDataNewUser();
		
		String name=data.getProperty("name");
		String email=data.getProperty("email");
		String password=data.getProperty("password");
		String phone=data.getProperty("phone");
		
		
		nu.newUserLogin(name,email, password, phone);
	
	
	}
	
	

}
