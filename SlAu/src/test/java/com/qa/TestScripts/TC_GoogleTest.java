package com.qa.TestScripts;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBaseGoogle;
public class TC_GoogleTest extends TestBaseGoogle {
	@Test
	public void search() throws InterruptedException
	{
 	GooglefOR.getSearchField().sendKeys("Automation testing");
		Thread.sleep(3000);
		List<WebElement> Suggestion=GooglefOR.Suggestion();
		for(WebElement ele: Suggestion)
		{	
		Reporter.log(ele.getText());
		System.out.println(ele.getText());
		}
	   GooglefOR.getSearchBotton().submit();
	
	}

	
	

}
