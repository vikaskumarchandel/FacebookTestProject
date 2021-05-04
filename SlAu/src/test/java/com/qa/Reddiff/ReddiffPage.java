package com.qa.Reddiff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddiffPage 
{
	WebDriver driver;
	@FindBy(linkText="Create Account")
	WebElement CreateAccount;
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")
	WebElement FullNameField;
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")
	WebElement EmailIdField;
	@FindBy(className="btn_checkavail")
	WebElement CheckAvailbalityButton;
	
	
	public ReddiffPage(WebDriver driver)
	{
		this.driver=driver;
	
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateAccount() {
		
		return CreateAccount;
	}


	public WebElement getFullNameField() {
		return FullNameField;
	}


	public WebElement getEmailIdField() {
		return EmailIdField;
	}


	public WebElement getCheckAvailbalityButton() {
		// TODO Auto-generated method stub
		return CheckAvailbalityButton;
	}




	

}
