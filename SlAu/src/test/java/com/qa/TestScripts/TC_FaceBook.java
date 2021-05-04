package com.qa.TestScripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelFile;
import com.qa.TestBase.TestBaseFaceBook;

public class TC_FaceBook extends TestBaseFaceBook {

	@Test(dataProvider="fetchData")
	public void login(String s1,String s2) throws InterruptedException
	{	
		Thread.sleep(1000);
		FaceBookfOR.getEmailField().clear();
		
		FaceBookfOR.getEmailField().sendKeys(s1);
		Thread.sleep(1000);
		FaceBookfOR.getPasswordField().clear();
		FaceBookfOR.getPasswordField().sendKeys(s2);
		
		Thread.sleep(1000);
		FaceBookfOR.getLogInButton().click();
		Thread.sleep(1000);
		
		FaceBookfOR.getwatchButton().click();
		Thread.sleep(3000);
		
		FaceBookfOR.getlogoutDropDown().click();
		Thread.sleep(3000);
		FaceBookfOR.getlogOut().click();
		

	}
	
	@DataProvider
	public Object[][] fetchData() throws IOException
	{
		String xlPath="C:\\Users\\vikas\\Downloads\\TestData\\TestData.xlsx";
		String xlSheet="Sheet2";
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
