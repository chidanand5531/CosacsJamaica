/**

* Project Name : COSACS

* Author : Chidanand

* Version : 10.5.2.2124

* Reviewed By : Vivek Bharti

* Date of Creation : March , 2020

* Modification History : 

*/
package com.cosacs.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cosacs.Locators.Xpath;
import com.cosacs.PageObject.BaseClass;
import com.cosacs.PageObject.Library;

public class COS85_WarrantyReports extends BaseClass {
	
	public static String year="2019";
	public static String Month="Apr";
	public static String Courts="Courts";
	public static String Both="Both";
	public static String all="All";
	public static String BranchSearch="171";
	public static String Branch="171 LUCKY DOLLAR MAY PEN";
	public static String SalesPSearch="Anna";
	public static String SalesPSelect="Anna-Alicia Ferguson";
	public static String RunNo="256";
	public static String PagelabelText="Warranty Sales Report";
	public static String DueWrrntlabelText="Warranties Due Renewal Report";
	public static String WrrntReturnlabelText="Warranty Returns Report";
	public static String WrrntHitlabelText="Warranty Hit Rate Report";
	public static String SolitationlabelText="Second Effort Solicitation Candidates Report";
	public static String BrokerWarrantylabelText="Broker Warranty Transactions Report";

	@Test(priority=1)
	public void warrantysales_Report_Test() throws Exception {
		try {
			Library.Interaction.IsDisplayed_Click(Xpath.WarrantyReports.Warranty);
			log.info("User clicked on warranty");
			Library.Interaction.moveToElement(Xpath.WarrantyReports.Reports);
			log.info("User mouse hovered on Reports");
			Library.Interaction.click(Xpath.WarrantyReports.Warrantysales);
			log.info("User clicked o  Warrantysales");
			Library.Interaction.IsDisplayed(Xpath.WarrantyReports.WarrantyReportsLabel);
			String Pagelabel=Library.Interaction.getelementText(Xpath.WarrantyReports.WarrantyReportsLabel);
			Assert.assertEquals(Pagelabel, PagelabelText);
			log.info("User Validated PageLable Successfylly");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReports.DelvrydateTo);
			Library.Interaction.userWait();
			log.info("User Clcked on the Date To");
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReports.SelectMonth, Month);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReports.SelectYear, year);
			log.info("User Selected Date and year on the DateWidget");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReports.SelectDate);
			log.info("User Selected DateFrom");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReports.DelvrydateTo);
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReports.SelectMonth, Month);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReports.SelectDate);
			Library.Interaction.userWait();
			Library.Interaction.selectAndSerachEle(Xpath.WarrantyReports.SaleTypeArrow, Xpath.WarrantyReports.SaleTypeText, Xpath.WarrantyReports.SaleTextSelect, "all");
			log.info("User Selected Sales Type");
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReports.SelectFacia, Courts);
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReports.SelectWarrantyType, Both);
			Library.Interaction.click(Xpath.WarrantyReports.RunBTN);
			Library.Interaction.IsDisplayed(Xpath.WarrantyReports.AccountNo);
			String text=Library.Interaction.getelementText(Xpath.WarrantyReports.AccountNo);
			log.info("Account nO is--->"+text);
			Library.Interaction.click(Xpath.WarrantyReports.Clear);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertFalse(false);
			log.info("Test Failed");
		}	
	}
	
	@Test(priority=2)
	public  void WarrantyDueRenewal_Report_Test() throws Exception {
		try {
			
			Library.Interaction.IsDisplayed_Click(Xpath.WarrantYDueRenewal.Warranty);
			log.info("User clicked on warranty");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.WarrantYDueRenewal.Reports);
			log.info("User mouse hovered on Reports");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.WarrantyDue);
			log.info("User clicked o  WarrantyDue");
			Library.Interaction.IsDisplayed(Xpath.WarrantyReports.WarrantyReportsLabel);
			String Pagelabel=Library.Interaction.getelementText(Xpath.WarrantyReports.WarrantyReportsLabel);
			Assert.assertEquals(Pagelabel, DueWrrntlabelText);
			log.info("User Validated PageLable Successfylly");
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantYDueRenewal.SelectFacia, Courts);
			log.info("User Selected facia");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.DelivrdateFrom);
			Library.Interaction.userWait();
			log.info("User Clcked on the Date To");
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantYDueRenewal.SelectMonth, Month);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantYDueRenewal.SelectYear, year);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.SelectDate);
			log.info("User Selected Date From");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.DelivrdateTo);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantYDueRenewal.SelectMonth, Month);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.SelectDate);
			log.info("User Selected Date To");
			Library.Interaction.click(Xpath.WarrantYDueRenewal.RunBTN);
			Library.Interaction.IsDisplayed(Xpath.WarrantYDueRenewal.AccountNo);
			String text=Library.Interaction.getelementText(Xpath.WarrantYDueRenewal.AccountNo);
			log.info("No of Quantity is--->"+text);
			Library.Interaction.click(Xpath.WarrantYDueRenewal.Clear);
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "WarntyDueRenewal");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	@Test(priority=3)
	public  void WarantyReturn_Reports_Test() throws Exception {
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.Warranty);
			log.info("User clicked on warranty");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.WarrantYDueRenewal.Reports);
			log.info("User mouse hovered on Reports");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReturns.WarrantyReturns);
			log.info("User clicked o  Warranty Returns");
			Thread.sleep(5000);
			String Pagelabel=Library.Interaction.getelementText(Xpath.WarrantyReports.WarrantyReportsLabel);
			Assert.assertEquals(Pagelabel, WrrntReturnlabelText);
			log.info("User Validated PageLable Successfylly");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReturns.CanceledFrom);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReturns.SelectMonth, Month);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReturns.SelectYear, year);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReturns.SelectDate);
			log.info("User Selected Date To");
			Robot robo=new Robot();
			robo.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReturns.SelectMonth, Month);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReturns.SelectDate);
			log.info("User Selected Date To");
			Library.Interaction.userWait();
			log.info("User Clcked on the Date From");
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReturns.returnType, all);
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReturns.warrantyType, Both);
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantYDueRenewal.SelectFacia, Courts);	
			log.info("User Selected facia,ReturnType and warrantyType");
			Library.Interaction.click(Xpath.WarrantyReturns.RunBTN);
			Library.Interaction.IsDisplayed(Xpath.WarrantYDueRenewal.AccountNo);
			String text=Library.Interaction.getelementText(Xpath.WarrantYDueRenewal.AccountNo);
			log.info("Account nO is--->"+text);
			Library.Interaction.click(Xpath.WarrantyReturns.Clear);
			
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "WarntyDueRenewal");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	@Test(priority=4)
	public  void WarrantyHitRate_Report_Test() throws Exception {
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.Warranty);
			log.info("User clicked on warranty");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.WarrantYDueRenewal.Reports);
			log.info("User mouse hovered on Reports");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyHitRate.WarrantyHitRate);
			log.info("User clicked o  Warranty Returns");
			Library.Interaction.IsDisplayed(Xpath.WarrantyReports.WarrantyReportsLabel);
			String Pagelabel=Library.Interaction.getelementText(Xpath.WarrantyReports.WarrantyReportsLabel);
			Assert.assertEquals(Pagelabel, WrrntHitlabelText);
			log.info("User Validated PageLable Successfylly");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyHitRate.DeliveredFrom);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyHitRate.SelectMonth, Month);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyHitRate.SelectYear, year);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReturns.SelectDate);
			log.info("User Selected Date To");
			Robot robo=new Robot();
			robo.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByVisibleText(Xpath.WarrantyReturns.SelectMonth, Month);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyReturns.SelectDate);
			log.info("User Selected Date To");
			Library.Interaction.userWait();
			log.info("User Clcked on the Date From");
			Library.Interaction.selectSuggestions(Xpath.WarrantyHitRate.BranchArrow, Xpath.WarrantyHitRate.BranchSearch, Xpath.WarrantyHitRate.BranchSelect, BranchSearch, Branch);
			Library.Interaction.selectSuggestions(Xpath.WarrantyHitRate.SalesPArrow, Xpath.WarrantyHitRate.SalesPSearch, Xpath.WarrantyHitRate.SalesSelect, SalesPSearch, SalesPSelect);
			log.info("User Selected facia,ReturnType and warrantyType");
			Library.Interaction.click(Xpath.WarrantyReturns.RunBTN);
			Library.Interaction.IsDisplayed(Xpath.WarrantYDueRenewal.AccountNo);
			String text=Library.Interaction.getelementText(Xpath.WarrantYDueRenewal.AccountNo);
			log.info("Account nO is--->"+text);
			Library.Interaction.click(Xpath.WarrantyReturns.Clear);
			
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "WarrantyHitRate_Report_Test");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	@Test(priority=5)
	public  void secondSolitaion_CandidatesReports_Test() throws Exception {
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.Warranty);
			log.info("User clicked on warranty");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.WarrantYDueRenewal.Reports);
			log.info("User mouse hovered on Reports");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.SecondeffortSolitationreports.WarrantySolitation);
			log.info("User clicked on  SecondeffortSolitationreports");
			Library.Interaction.IsDisplayed(Xpath.WarrantyReports.WarrantyReportsLabel);
			String Pagelabel=Library.Interaction.getelementText(Xpath.WarrantyReports.WarrantyReportsLabel);
			Assert.assertEquals(Pagelabel, SolitationlabelText);
			log.info("User Validated PageLable Successfylly");
			Library.Interaction.selectSuggestions(Xpath.SecondeffortSolitationreports.BranchArrow, Xpath.SecondeffortSolitationreports.BranchSearch, Xpath.SecondeffortSolitationreports.BranchSelect, BranchSearch, Branch);
			log.info("User Selected facia,ReturnType and warrantyType");
			Library.Interaction.click(Xpath.WarrantyReturns.RunBTN);
			Library.Interaction.IsDisplayed(Xpath.WarrantYDueRenewal.AccountNo);
			String text=Library.Interaction.getelementText(Xpath.WarrantYDueRenewal.AccountNo);
			log.info("Account nO is--->"+text);
			Library.Interaction.click(Xpath.WarrantyReturns.Clear);
			
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "WarntyDueRenewal");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	@Test(priority=6)
	public  void brokerwarranty_Transactionsreports_Test() throws Exception {
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantYDueRenewal.Warranty);
			log.info("User clicked on warranty");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.WarrantYDueRenewal.Reports);
			log.info("User mouse hovered on Reports");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.BrokerWarrantyTransactions.BrokerWarranty);
			log.info("User clicked on  BrokerWarrantyTransactions");
			Library.Interaction.IsDisplayed(Xpath.WarrantyReports.WarrantyReportsLabel);
			String Pagelabel=Library.Interaction.getelementText(Xpath.WarrantyReports.WarrantyReportsLabel);
			Assert.assertEquals(Pagelabel, BrokerWarrantylabelText);
			log.info("User Validated PageLable Successfylly");
			Library.Interaction.setTextBoxByXpath(Xpath.BrokerWarrantyTransactions.RunNo, RunNo);
			log.info("User Selected facia,ReturnType and warrantyType");
			Library.Interaction.click(Xpath.BrokerWarrantyTransactions.RunBTN);
			Library.Interaction.IsDisplayed(Xpath.BrokerWarrantyTransactions.AccountNo);
			String text=Library.Interaction.getelementText(Xpath.BrokerWarrantyTransactions.AccountNo);
			log.info("Account nO is--->"+text);;
			Library.Interaction.click(Xpath.BrokerWarrantyTransactions.Clear);
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "WarntyDueRenewal");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	
}


