package com.qa.TestScripts;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.TestBase.TestBaseAmazon;
public class TC_AmazonTest extends TestBaseAmazon {
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
	public Object[][] fetchData()
	{
		Object data[][]=new Object[3][2];
		data[0][0]="Books";
		data[0][1]="Da vinci code";
				
		data[1][0]="Electronics";
		data[1][1]="mobile phone";
		
		data[2][0]="Baby";
		data[2][1]="Toy";
		
		return data;
	}
	
}
