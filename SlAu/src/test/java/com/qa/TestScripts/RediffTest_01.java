package com.qa.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Reddiff.ReddiffPage;

public class RediffTest_01 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		ReddiffPage ReddiffFor= new ReddiffPage(driver);
		driver.get("https://www.rediff.com/");
		ReddiffFor.getCreateAccount().click();
		 ReddiffFor.getFullNameField().sendKeys("Vikas");
		 ReddiffFor.getEmailIdField().sendKeys("5454vikas@gmail.com");
		 ReddiffFor.getCheckAvailbalityButton().click();
		 driver.close();
	
	
	}

}
