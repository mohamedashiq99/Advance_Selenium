package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement Addnewaddress;
	
	public WebElement getAddnewaddress() {
		return Addnewaddress;
	}

	public WebElement getAddaddress() {
		return deleteaddress;
	}
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement deleteaddress;
}
