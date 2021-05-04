package com.qa.TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelFile;
import com.qa.TestBase.TestBaseAmazon;

public class TC_AmazonTest01 extends TestBaseAmazon {
	@Test(dataProvider="fetchData")
	public void seachCategory(String s1,String s2)throws InterruptedException
	{
		Thread.sleep(3000);
		new Select(AmazonfOR.getDropDownMenu()).selectByVisibleText(s1);
		AmazonfOR.getSearchField().sendKeys(s2);
		AmazonfOR.getSearchButton().click();
		AmazonfOR.getSearchField().clear();
		List<WebElement> titleOfTheBook = AmazonfOR.getTitleOfTheBook();
		List<WebElement> itemPrices = AmazonfOR.getItemPrices();
		for(int i=0; i<titleOfTheBook.size(); i++) {
			if(!(itemPrices.get(i).getText().equals("0")))
				System.out.println(titleOfTheBook.get(i).getText()+"--> Rs."+itemPrices.get(i).getText());
			else
				System.out.println(titleOfTheBook.get(i).getText()+"--> Currently unavailable");
		}
		List<WebElement> items = AmazonfOR.getItems();
		for(int i=0; i<items.size(); i++) {
			System.out.println(items.get(i).getText()+"--> Rs."+itemPrices.get(i).getText());
		}
	}
	
	
	@DataProvider
	public Object[][] fetchData() throws IOException
	{
		String xlPath="C:\\Users\\vikas\\Downloads\\TestData\\TestData.xlsx";
		String xlSheet="Sheet1";
		int rowcount=ExcelFile.getRowCount(xlPath, xlSheet);
		int cellcount=ExcelFile.getCellCount(xlPath, xlSheet, rowcount);
		String [][] data=new String[rowcount][cellcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				data[i-1][j]=ExcelFile.getCellData(xlPath, xlSheet, i, j);
			}
		}
		
		return data;
	}
}
