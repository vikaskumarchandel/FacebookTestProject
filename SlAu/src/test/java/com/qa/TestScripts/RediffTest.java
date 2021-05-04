package com.qa.TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RediffTest
{

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.rediff.com/");
	 driver.findElement(By.linkText("Create Account")).click();
	 String currenturl=driver.getCurrentUrl();
	 if(currenturl.contains("register"))
	 {
		 System.out.println("The user is landed successfully on registration page");
		 driver.findElement(By.xpath( "//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Vikas chandel");
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("vikas@redif.com");
		 driver.findElement(By.className("btn_checkavail")).click();
	 }
	 else
	 {
		 System.out.println("The user is not landed successfully on registration page");
	 }
	 driver.close();
	}

}
