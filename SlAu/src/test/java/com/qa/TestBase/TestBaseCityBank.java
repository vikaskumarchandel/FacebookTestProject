package com.qa.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.Pages.CityBankPage;

public class TestBaseCityBank {
	WebDriver driver;
	 public CityBankPage CityBankfOR;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\vikas\\Downloads\\New folder\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
		CityBankfOR= new CityBankPage(driver);
		driver.get(Url);
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	

}
}
