package com.qa.TestScripts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBaseCityBank;

public class TC_CityBank  extends TestBaseCityBank{
	
	
	@Test
	public void multipleWindow()
	{
		CityBankfOR.getTermsCondition().click();
		List<WebElement>  b=CityBankfOR.getAllLink();
		int size=b.size();
		//System.out.println(size);
		for(int i=1;i<size;i++)
		{
			WebElement a=b.get(i);
			String s=a.getText();
			System.out.println(s);
		}
		
/*Iterator<WebElement> it = b.iterator();
        
        while(it.hasNext()){
            
           String url = it.next().getAttribute("href");
            
            System.out.println(url);
            
            
            }
            */
        
	}
	

}

