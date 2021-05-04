package com.qa.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.Google.GooglePage;
public class TestBaseGoogle {
	WebDriver driver;
	 public GooglePage GooglefOR;
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
		GooglefOR= new GooglePage(driver);
		driver.get(Url);
		
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	

}

