package com.qa.TestScripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Pages.AmzonPage;

public class AmazonTest_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		AmzonPage AmazonFor= new AmzonPage(driver);
		driver.get("https://www.amazon.in/");
		AmazonFor.ListBox().click();
		List<WebElement>  b=driver.findElements(By.tagName("a"));
		int size=b.size();
		System.out.println(size);
		for(int i=1;i<size;i++)
		{
			WebElement a=b.get(i);
			String s=a.getText();
			System.out.println(s);
		}
	}

}
