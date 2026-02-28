package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutbtn;
	
	@FindBy(xpath = "//a[text()='Addresses']")
	private static WebElement addressbtn;

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public static WebElement getAddressbtn() {
		return addressbtn;
	}
	
	
}
