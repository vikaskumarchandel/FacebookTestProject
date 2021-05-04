package com.qa.TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.Pages.NewTourPage;
public class NewTourTest {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	NewTourPage TourFor= new NewTourPage(driver);
	driver.get("http://demo.guru99.com/test/newtours/");
	TourFor.getUserName().sendKeys("mercury");
	TourFor.getPassword().sendKeys("mercury");
	TourFor.getSubmittButton().click();
	TourFor.getSearchFlight().click();
	TourFor.getSelectPassenger().click();
	TourFor.getSelectDepartureLoc().click();
	TourFor.getSelectDepartureMonth().click();
	TourFor.getSelectDepartureDate().click();
	TourFor.getSelectArrivalLoc().click();
	TourFor.getArrivalMonth().click();
	TourFor.getArrivalDate().click();
	TourFor.getContinueToSearchFlight().click();
	
	
	
	
	
	
	}

}
