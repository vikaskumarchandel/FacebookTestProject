package com.qa.TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.Google.GooglePage;

public class GoogleTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		GooglePage GoogleFor= new GooglePage(driver);
		driver.get("https://www.google.com/");
		GoogleFor.getSearchField().sendKeys("AutomationTesting");
		GoogleFor.getSearchBotton().click();
		driver.close();
	}
	

}
