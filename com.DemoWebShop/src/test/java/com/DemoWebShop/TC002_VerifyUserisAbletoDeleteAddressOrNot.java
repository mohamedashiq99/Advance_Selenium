package com.DemoWebShop;

import org.testng.annotations.Test;

import com.DemoWebShop_POM.AddressPage;
import com.demoweb.BaseTest;
import com.demoweb.WebDriverUtility;

public class TC002_VerifyUserisAbletoDeleteAddressOrNot extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		@Test
		public void addAddress() {
			
			Thread.sleep(2000);
			WebDriverUtility.javaScriptScrollToElement(driver,homePage.getAddressBtn());
			homePage.getAddressBtn().click();
			
			AddressPage addressPage = new AddressPage(driver);
			
			
		}
		
	}

}
