package com.qa.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.Pages.FaceBookPage;

public class TestBaseFaceBook {
	WebDriver driver;
	public ChromeOptions options;
	 public FaceBookPage FaceBookfOR;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{ options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
			driver =new ChromeDriver(options);
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\vikas\\Downloads\\New folder\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
	FaceBookfOR= new FaceBookPage(driver);
		driver.get(Url);
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
