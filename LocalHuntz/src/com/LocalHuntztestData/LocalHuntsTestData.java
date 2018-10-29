package com.LocalHuntztestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocalHuntsTestData
{
	
	public Properties testDataNewUser() throws IOException
	{
		String newUserPath="C:\\Users\\hp\\eclipse-workspace\\LocalHuntz\\testData\\NewUser.properties";
		
		FileInputStream fis = new FileInputStream(newUserPath);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop;
		
	}
	
	
	
}
