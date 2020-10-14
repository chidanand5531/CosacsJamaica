
package com.cosacs.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.cosacs.Locators.Xpath;
import com.cosacs.PageObject.BaseClass;
import com.cosacs.PageObject.Library;
import com.cosacs.Utilities.JsonParser;

public class COS19_StockCount extends BaseClass {
	String Div_Name = "SDA";
	//String Location_Send = "LUCKY DOLLAR MANDEVI";
	//String Location_Name = "LUCKY DOLLAR MANDEVI";
	String CountDate = "08/10/2020";
	String DivSend = "FURNI";
	String DivName = "FURNITURE";
	String DepSend = "BEDR";
	String DepName = "BEDROOM";
	String ClassSend = "BED M";
	String ClassName = "BED METAL";
	String LocSearchSend = "Sche";
	String LocSearchName = "Scheduled";
	String TypeSend = "Perpe";
	String TypeName = "Perpetual";
	String ScheduleFrom = "08/10/2020";
	String StockCount = "150";
	String Comment = "No Variance";
	String FindProductSend = "BA749";
	String FindProductName = "BA749 ";

	@Test
	public void Stock_Count() throws IOException {
		try {
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CreateStockCount.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.CreateStockCount.create);
			Library.Interaction.print("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CreateStockCount.StockCount);
			Library.Interaction.print("User Clicked on StockCount");
			Library.Interaction.userWait();

		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "StockCount");
			AssertJUnit.assertFalse(false);
			log.info("Test Failed");
		}
	}

	@Test(dependsOnMethods = { "Stock_Count" })
	public void CreateStock() throws IOException {
		try {
			Library.Interaction.selectEle(Xpath.CreateStockCount.LocationDropdown, Xpath.CreateStockCount.Search,
					Xpath.CreateStockCount.List, JsonParser.changetestData("stockCountData.Location_Name"),JsonParser.changetestData("stockCountData.Location_Name"));
			Library.Interaction.print("User Entered Location");
			Library.Interaction.setTextBoxByXpath(Xpath.CreateStockCount.CountDate, CountDate);
			Library.Interaction.print("User Entered Heirarchy");
			Library.Interaction.selectEle(Xpath.CreateStockCount.DivisionDropDown, Xpath.CreateStockCount.Search,
					Xpath.CreateStockCount.List, DivSend, DivName);
			Library.Interaction.selectEle(Xpath.CreateStockCount.DepartmentDropDown, Xpath.CreateStockCount.Search,
					Xpath.CreateStockCount.List, DepSend, DepName);
			Library.Interaction.selectEle(Xpath.CreateStockCount.ClassDropDown, Xpath.CreateStockCount.Search,
					Xpath.CreateStockCount.List, ClassSend, ClassName);
			Library.Interaction.click(Xpath.CreateStockCount.Schedule);
			Library.Interaction.print("User Clicked on Schedule");
			Library.Interaction.userWait();
			Library.Interaction.print("Scheduling Starts");
			Library.Interaction.click(Xpath.CreateStockCount.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.moveToElement(Xpath.CreateStockCount.Search1);
			Library.Interaction.click(Xpath.CreateStockCount.SearchStockCount);
			Library.Interaction.print("User Entered Location");
			Thread.sleep(6000);
			Library.Interaction.selectEle(Xpath.CreateStockCount.LocationSearchDropDown, Xpath.CreateStockCount.Search,
					Xpath.CreateStockCount.List, JsonParser.changetestData("stockCountData.Location_Name"),JsonParser.changetestData("stockCountData.Location_Name"));
			Library.Interaction.selectEle(Xpath.CreateStockCount.StatusDropDown, Xpath.CreateStockCount.Search,
					Xpath.CreateStockCount.List, LocSearchSend, LocSearchName);
			Library.Interaction.selectEle(Xpath.CreateStockCount.TypeDropDown, Xpath.CreateStockCount.Search,
					Xpath.CreateStockCount.List, TypeSend, TypeName);
			Library.Interaction.setTextBoxByXpath(Xpath.CreateStockCount.ScheduledFrom, ScheduleFrom);
			Library.Interaction.click(Xpath.CreateStockCount.Search2);
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.CreateStockCount.StockCountID);
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.CreateStockCount.StartButton);
			Library.Interaction.print("User Checks the Radio button");
			Library.Interaction.click(Xpath.CreateStockCount.CollectionNotes);
			Library.Interaction.click(Xpath.CreateStockCount.DeliveryNotes);
			Library.Interaction.click(Xpath.CreateStockCount.GoodsReciept);
			Library.Interaction.click(Xpath.CreateStockCount.ReturnToVendor);
			Library.Interaction.click(Xpath.CreateStockCount.StartCount);
			Library.Interaction.selectEle(Xpath.CreateStockCount.FindProductDropDown,
					Xpath.CreateStockCount.FindProductSearch, Xpath.CreateStockCount.FindProductList, FindProductSend,
					FindProductName);
			Library.Interaction.print("User Enters the product");
			Library.Interaction.setTextBoxByXpath(Xpath.CreateStockCount.StockCount1, StockCount);
			Library.Interaction.setTextBoxByXpath(Xpath.CreateStockCount.Comments, Comment);
			Library.Interaction.click(Xpath.CreateStockCount.SaveAll);
			Thread.sleep(3000);
			Library.Interaction.click(Xpath.CreateStockCount.PrintVarience);
			Library.Interaction.print("User Click on the Print varience");
			Thread.sleep(4000);
			System.out.print("Print Varience");
			String windows = driver.getWindowHandle();
			driver.switchTo().window(windows);
			System.out.println("success");
			Thread.sleep(3000);
			Library.Interaction.click(Xpath.CreateStockCount.CloseStockCount);
			Library.Interaction.print("User Closes the Stock Count");
			String StockCountID = Library.Interaction.getElmtText(Xpath.CreateStockCount.PageText);
			System.out.println(StockCountID);
			String StockCountID1 = "";
			String[] StockCountID2 = StockCountID.split("#");
			for (int i = 0; i < StockCountID2.length - 1; i++) {
				StockCountID1 = StockCountID2[i + 1];
			}
			System.out.println(StockCountID1);
			Library.Interaction.print("User Verifies the Status");
			Library.Interaction.click(Xpath.CreateStockCount.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.moveToElement(Xpath.CreateStockCount.Search1);
			Library.Interaction.click(Xpath.CreateStockCount.SearchStockCount);
			Thread.sleep(5000);
			Library.Interaction.setTextBoxByXpath(Xpath.CreateStockCount.StockCountMin, StockCountID1);
			Library.Interaction.click(Xpath.CreateStockCount.Search2);
			Thread.sleep(5000);
			String StockCountStatus = Library.Interaction.getElmtText(Xpath.CreateStockCount.Status);
			Assert.assertEquals(StockCountStatus, "Closed");
			System.out.println("status verified");
			Thread.sleep(4000);
			Library.Interaction.click(Xpath.Combo_ProductCreation.Home);

		} catch (Exception e) {
			captureScreen(driver, "createStockCount");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
}
