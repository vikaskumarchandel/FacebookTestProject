package com.qa.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstwebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");

	WebDriver	driver=new ChromeDriver();
	driver.get("https://www.hdfcbank.com/");
	
	/*System.setProperty("webdriver.edge.driver", "C:\\Users\\vikas\\Downloads\\New folder\\msedgedriver.exe");
	EdgeDriver edriver= new EdgeDriver();*/
	}

}
