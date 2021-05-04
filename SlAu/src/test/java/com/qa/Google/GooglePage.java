package com.qa.Google;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class GooglePage 
{
	WebDriver driver;
@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
WebElement SearchField;
public WebElement getSearchField()
{
	return SearchField;}
@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
WebElement SearchBotton;
public WebElement getSearchBotton() {
	return SearchBotton;
}
@FindAll(@FindBy(xpath=("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")))
List<WebElement> Suggestion;
public List<WebElement> Suggestion()
{
	return Suggestion;
	
}

public GooglePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

}
