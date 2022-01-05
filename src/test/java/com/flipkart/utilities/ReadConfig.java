package com.flipkart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pr;

	//Constructor
	public ReadConfig() {
		
		File file = new File ("C:\\Users\\prasa\\eclipse-workspace\\flipkart\\configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			pr.load(fis);
		}
		catch(Exception e) {
			System.out.println("Encountered error :"+e.getMessage());
		}
	}
	
	//Method to fetch the data from config.properties file
	public String getAppURL() {
		String URL = pr.getProperty("baseURL");
		return URL;
	}
	
	public String getUsername() {
		String userName = pr.getProperty("username");
		return userName;
	}
	
	public String getPassword() {
		String passWord = pr.getProperty("pasword");
		return passWord;
	}
	
	public String getChromepath() {
		String chromePath = pr.getProperty("chromepath");
		return chromePath;
	}
}
