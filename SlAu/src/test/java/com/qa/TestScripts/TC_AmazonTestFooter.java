package com.qa.TestScripts;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.qa.TestBase.TestBaseAmazon1;

public class TC_AmazonTestFooter extends TestBaseAmazon1 {

	@Test
	public void getCountyNames()
	{
		List<WebElement> cn=AmazonfOR.getAllLink();
		/*for(WebElement countryname:cn)
		{
			Reporter.log(countryname.getText()+"    "+countryname.getAttribute("href"),true);
		}*/
		List<WebElement>  Links=AmazonfOR.getAllLink();
		int size=Links.size();

		for(int i=1;i<size;i++)
		{
			WebElement Elements=Links.get(i);
			System.out.println(Elements.getText()+"-------"+Elements.getAttribute("href"));
		}

	}
	
}
