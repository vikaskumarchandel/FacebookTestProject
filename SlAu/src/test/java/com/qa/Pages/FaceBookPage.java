package com.qa.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage {
	WebDriver driver;
	public FaceBookPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailField;
	
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement PasswordField;
	
	
	@FindBy(xpath="//button[@name='login']")
	WebElement LogIn;
	@FindBy(xpath="(//*[@class='a8c37x1j ms05siws hwsy1cff b7h9ocf4 em6zcovv'])[1]")
	WebElement watch;
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/i")
	WebElement Dropdown;
	@FindBy(xpath="(//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m'])[5]")
	WebElement LogOut;
	public WebElement getEmailField()
	{
		return EmailField;
	}
	public WebElement getPasswordField()
	{
		return PasswordField;
	}
	public WebElement getLogInButton()
	{
		return LogIn;
	}
	public WebElement getwatchButton()
	{
		return watch;
	}
	public WebElement getlogoutDropDown() {
		return Dropdown;
	}
	public WebElement getlogOut() {
		return LogOut;
	}



}
