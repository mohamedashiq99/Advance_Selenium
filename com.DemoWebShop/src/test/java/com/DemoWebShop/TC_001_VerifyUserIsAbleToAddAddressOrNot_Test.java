package com.DemoWebShop;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShop_POM.AddNewAddress_Test;
import com.DemoWebShop_POM.AddressPage;
import com.DemoWebShop_POM.HomePage;
import com.demoweb.FileUtility;
import com.demoweb.WebDriverUtility;

import com.demoweb.BaseTest;
import com.DemoWebShop_POM.AddNewAddress_Test;
import com.DemoWebShop_POM.AddressPage;

public class TC_001_VerifyUserIsAbleToAddAddressOrNot_Test extends BaseTest {

	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {

		Thread.sleep(2000);
		WebDriverUtility.javaScriptScrollToElement(driver, homePage.getAddressesBtn());
		HomePage.getAddressbtn().click();

		AddressPage addressesPage = new AddressesPage(driver);
		Thread.sleep(2000);
		WebDriverUtility.javaScriptScrollToElement(driver, addressesPage.getAddnewaddress());
		addressesPage.getAddnewaddress().click();

		AddNewAddress_Test newAddressPage = new AddNewAddress_Test(driver);
		newAddressPage.getFirstName().sendKeys(FileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		newAddressPage.getLastName().sendKeys(FileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		

		WebDriverUtility.selectByVisibleText(newAddressPage.getCountryDD(),
				FileUtility.readDataFromExcelFile("Sheet1", 1, 3));

		
		newAddressPage.getAddress1().sendKeys(FileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		newAddressPage.getZipcode().sendKeys(FileUtility.readDataFromExcelFile("Sheet1", 1, 6));
		newAddressPage.getSavebtn().click();

		Thread.sleep(3000);
		WebDriverUtility.webPageScreenShot(driver);

	}

}
