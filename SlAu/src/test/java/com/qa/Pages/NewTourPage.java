package com.qa.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewTourPage {
	
	WebDriver driver;
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	 WebElement UserName;
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	WebElement Password;
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	WebElement SubmittButton;
	@FindBy(linkText="Flights")
	WebElement SearchFlight;
	@FindBy(name="passCount")
    WebElement SelectPassenger;
	@FindBy(name="fromPort")
	WebElement SelectDepartureLoc;
	@FindBy(name="fromMonth")
	WebElement SelectDepartureMonth;
	@FindBy(name="fromDay")
	WebElement SelectDepartureDate;
	@FindBy(name="toPort")
	WebElement SelectArrivalLoc;
	@FindBy(name="toMonth")
	WebElement SelectArrivalMonth;
	@FindBy(name="toDay")
	WebElement SelectArrivalDate;
	@FindBy(name="findFlights")
	WebElement ContinueToSearchFlight;

	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSubmittButton() {
		return SubmittButton;
	}
	public WebElement getSearchFlight() {
		return SearchFlight;
	}
	public NewTourPage( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSelectPassenger() 
	{
		Select dropdown=new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")));
		dropdown.selectByIndex(3);
		return SelectPassenger;
	}
	public WebElement getSelectDepartureLoc() 
	{
		Select dropdown=new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")));
		dropdown.selectByValue("London");
		return SelectDepartureLoc;
	}
	public WebElement getSelectDepartureMonth() {
		Select list=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/select[1]")));
		list.selectByValue("2");
		return SelectDepartureMonth;
	}
	public WebElement getSelectDepartureDate() {
		Select list=new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]")));
		list.selectByValue("10");
		return SelectDepartureDate;
	}
	public WebElement getSelectArrivalLoc() {
		Select dropdown= new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select")));
		dropdown.selectByVisibleText("Paris");
		return SelectArrivalLoc;
	}
	public WebElement getArrivalMonth() {
		Select list= new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]")));
		list.selectByVisibleText("May");
		return SelectArrivalMonth;
	}
	public WebElement getArrivalDate() {
		
		Select list=new Select(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]")));
		list.selectByVisibleText("10");
		return SelectArrivalDate;
	}
	public WebElement getContinueToSearchFlight() {
		return ContinueToSearchFlight;
	}

}
