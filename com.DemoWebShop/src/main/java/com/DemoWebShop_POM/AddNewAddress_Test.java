package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_Test {
	public AddNewAddress_Test(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "Address_FirstName")
	private WebElement firstName;
	
	@FindBy(id = "Address_FirstName")
	private WebElement lastName;
	
	@FindBy(id = "Address_Email")
	private WebElement email;
	
	@FindBy(id = "Address_CountryId")
	private WebElement countryDropdown;
	
	@FindBy(id = "Address_City")
	private WebElement city;
	
	@FindBy(id = "Address_Address1")
	private WebElement address1;
	
	@FindBy(id = "Address_ZipPostalCode")
	private WebElement zipcode;
	
	@FindBy(id = "Address_PhoneNumber")
	private WebElement phoneno;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement savebtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	

}
