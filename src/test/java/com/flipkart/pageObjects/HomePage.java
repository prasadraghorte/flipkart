package com.flipkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver lDriver;
	
	public HomePage(WebDriver rDriver){
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy (xpath = "//*[@class='_331-kn _2tvxW']")
	WebElement HomePageCategories;
	
	public boolean isHomeScreenDisplayed() {
		if(HomePageCategories.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
}
