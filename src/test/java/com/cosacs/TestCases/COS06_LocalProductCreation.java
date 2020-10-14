/**

* Project Name : COSAC

* Author : Vivek Bharti

* Version : 10.5.2.2124

* Reviewed By : SARAVANA KUMAR

* Date of Creation : Mar 17, 2020

* Modification History :

* Date of change : 

* Version : V1.1

* changed function :

* change description :

* Modified By : 

*/
package com.cosacs.TestCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cosacs.Locators.Xpath;
import com.cosacs.PageObject.BaseClass;
import com.cosacs.PageObject.Library;
public class COS06_LocalProductCreation extends BaseClass {
	
	String ExpecLocalProdTitle = "Product Enquiry";
	String vendorCost = "1500";
	String landedCost = "2000";
	String currency = "1500";
	String cashPrice = "500";
	String regularPrice = "300";
	String dutyFreePrice = "20";
	String pTOName="Training manual Tax";
	String pTORate="8";
	

	//User is Clicking and Verifying Local Product
	@Test
	public void LocalProduct() throws Throwable {
	
		try {
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			log.info("User Clicked to merchandising");
			Library.Interaction.userWait();
			Thread.sleep(3000);
			Library.Interaction.moveToElement(Xpath.LocalProduct.SearchSubMenu);
			Library.Interaction.print("User Clicked on Search");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.SrchProdEnquiry);
			Library.Interaction.userWait();
			Library.Interaction.print("User Clicked on Product Enquiry");
			log.info("User Clicked Product Enquiry");
			String LocalProdCreationTitle = driver.findElement(By.xpath(Xpath.LocalProduct.VerifyProdEnquiry)).getText();
			Assert.assertEquals(LocalProdCreationTitle, ExpecLocalProdTitle);
			log.info("User is in Product Enquiry Page");

			} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "LocalProduct");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	//User validating/Verifying Local Product Creation Page
	
	@Test(dependsOnMethods = "LocalProduct")
	public void createLocationForm() throws IOException {
		try {
			//Library.Interaction.userWait();
			Library.Interaction.ExplicitWait(Xpath.LocalProduct.ProdStatus);
			Library.Interaction.click(Xpath.LocalProduct.ProdStatus);
			Library.Interaction.print("User Selected Product Status");
			log.info("User Selected Product Status");
			Library.Interaction.ExplicitWait(Xpath.LocalProduct.ProdType);
			Library.Interaction.click(Xpath.LocalProduct.ProdType);
			Library.Interaction.print("User Selected Product Type");
			log.info("User Selected Product Type");
			Thread.sleep(5000);
			Library.Interaction.click(Xpath.LocalProduct.firstProduct);
			Library.Interaction.print("User Clicked to Product");
			log.info("User Clicked to Product");
			Library.Interaction.userWait();
			try
			{
			if (driver.findElement(By.xpath(Xpath.LocalProduct.verifyLocalProduct)).isDisplayed()) 
			{
				Library.Interaction.print("User are in Local Product Page");
			} }
			catch(Exception e) 
			{
				e.printStackTrace();
                System.out.print("Local Product Page not found");
			}
		
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.PrintPriceTkt);
			Library.Interaction.print("User Checked to PrintPriceTkt");
			Library.Interaction.userWait();
			Library.Interaction.verifyToastMessage(Xpath.toastMassage.Message_catch);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.RequiresLabel);
			Library.Interaction.userWait();
			Library.Interaction.verifyToastMessage(Xpath.toastMassage.Message_catch);
			Library.Interaction.userWait();
			try
			{
			if (driver.findElement(By.xpath(Xpath.LocalProduct.AvlOnline)).isDisplayed()) 
			{
				Library.Interaction.selectEleByIndex(Xpath.LocalProduct.AvlOnline, 1);
				log.info("User able to comlete Export setting field");
			}
			}
			catch(Exception e) 
			{
			   e.printStackTrace();
			   Library.Interaction.print("Fail: User not able to find dropDown");
			   log.info("User not able to comlete Export setting field-Fail: User not able to find dropDown");
			}
			
			Boolean Selected=driver.findElement(By.xpath(Xpath.LocalProduct.WarrantyCheckBox)).isSelected();
			if ( Selected== false) {
				driver.findElement(By.xpath(Xpath.LocalProduct.WarrantyCheckBox)).click();
				System.out.println("Test has selected Warranty checkBox ");
				} else {
				System.out.println("Selenium checkbox was selected on default");
				}
	        Thread.sleep(10000);
			Library.Interaction.ScrollDownTill_ElementFound(Xpath.LocalProduct.VendorCost);
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocalProduct.VendorCost,vendorCost );
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocalProduct.LandedCost,landedCost );
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.Currency);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.selectCurrency);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.costPriceSave);
			Thread.sleep(2000);
			log.info("User verified Cost Pricing Field");
			Library.Interaction.IsDisplayed(Xpath.toastMassage.Message_catch);
			Library.Interaction.verifyToastMessage(Xpath.toastMassage.Message_catch);
			Thread.sleep(10000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-900)");
			Thread.sleep(2000);
			Library.Interaction.moveToElement(Xpath.LocalProduct.RtlPriceAdd);
			Library.Interaction.click(Xpath.LocalProduct.RtlPriceAdd);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.clickEffDate);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.selectEffDate);
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocalProduct.CashPrice,cashPrice );
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocalProduct.RegularPrice,regularPrice );
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocalProduct.DutyFreePrice,dutyFreePrice );
			Thread.sleep(7000);
            Library.Interaction.click(Xpath.LocalProduct.saveRetailPricing);
            log.info("User able to save retail pricieng details");
			Library.Interaction.userWait();
			Library.Interaction.verifyToastMessage(Xpath.toastMassage.Message_catch);
			Library.Interaction.IsDisplayed_Click(Xpath.LocalProduct.MessageClick);
			Thread.sleep(7000);
			Library.Interaction.ScrollUpTill_ElementFound(Xpath.LocalProduct.PTOverrideAdd);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocalProduct.PTOverrideAdd);
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocalProduct.PTOName,pTOName );
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocalProduct.PTORate,pTORate );
			Library.Interaction.userWait();
			Library.Interaction.setTomorrowDate(Xpath.LocalProduct.PTOEffectDate);
			Library.Interaction.ExplicitWait(Xpath.LocalProduct.PTOSave);
			Library.Interaction.click(Xpath.LocalProduct.PTOSave);
			log.info("User able to save Product Tax Overrides");
			Library.Interaction.userWait();
			((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
            Library.Interaction.userWait();
            try {
            String statusName=driver.findElement(By.xpath(Xpath.LocalProduct.status)).getText();
            
            if (statusName.equals("Active New")) 
            {
            	Library.Interaction.print("Pass: Product is in Active New State");
			}}
            catch (Exception e) {
            	Library.Interaction.print("Need to Check after EOD.");
			}
			Thread.sleep(5000);
		} 
		catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "createLocationForm");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
    }
}