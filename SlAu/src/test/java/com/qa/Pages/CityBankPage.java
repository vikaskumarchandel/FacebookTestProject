package com.qa.Pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CityBankPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div[1]/ul/li[1]/a")
	WebElement TermsCondition;
	public WebElement getTermsCondition()
	{
		return TermsCondition;
	}
	@FindAll(@FindBy(tagName="a"))
	List<WebElement> AllLink;
	public List<WebElement> getAllLink()
	{
		return AllLink;
	}

	public CityBankPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
