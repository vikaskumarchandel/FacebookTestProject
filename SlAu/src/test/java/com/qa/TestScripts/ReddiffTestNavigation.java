package com.qa.TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ReddiffTestNavigation {
	/* 1.Open the browser
	 * 2.Launch the Rediff.com
	 * 3.Get & print the title of the home page 
	 * 4.click on sign in
	 * 5.get print title of login page
	 * 6.Go back to the previous page using navigate method
	 * 7.get the title & check if it same as home page
	 * 8.use forward method 7 get the same page title & check if it same as login page
	 * 9.close all the browser entities
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		String ht=driver.getTitle();
		System.out.println(ht);
		driver.findElement(By.className("signin")).click();
		String lt=driver.getTitle();
		System.out.println(lt);
		driver.navigate().back();
		String ht1=driver.getTitle();
		if(ht.equals(ht1)==true) 
		{
			System.out.println("it is same as home page");
		}
		driver.navigate().forward();
		String lt1=driver.getTitle();
		if(lt.equals(lt1)==true) 
		{
			System.out.println("it is same as login page");
		}
		driver.close();
	}
}
