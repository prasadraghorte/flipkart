package com.flipkart.testCases;
import java.io.IOException;

import org.testng.annotations.*;


public class HomePageTests extends TestBase {
	
	@Test
	public void getHomePage() throws IOException {
		driver.get(baseURL);
		logger.info("Opened Base URL");
		if(driver.getCurrentUrl().equals(baseURL))
		{
			logger.info("Test passd");
		}
		else
		{
			captureScreen(driver,"");
			logger.info("Test failed");
		}
	}

}
