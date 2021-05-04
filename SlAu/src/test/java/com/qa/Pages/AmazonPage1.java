package com.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage1 {
	WebDriver driver;
	
	public AmazonPage1(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll(@FindBy(xpath="//*[@id=\"navFooter\"]/div[4]/ul/li/a"))
	List<WebElement> AllLink ;

	
	public List<WebElement> getAllLink()
	{
		return AllLink;
	}

}
