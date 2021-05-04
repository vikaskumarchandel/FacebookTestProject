package com.qa.TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleTest {
	/* 1.Open browser
	 * 2.Launch google url
	 * 3.Search for automation testing
	 * 4.Submit the input
	 * 5.Check if the title is same as search team
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	  WebElement  element=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		element.sendKeys("Automation Testing");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).submit();
		String title= driver.getTitle();
		if(title.contains("Automation Testing"))
		{
			System.out.println("IT IS SAME ");
		}
	}
}
