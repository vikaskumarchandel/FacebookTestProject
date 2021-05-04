package com.qa.Pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AmazonPage {
	public WebDriver driver;
	public AmazonPage(WebDriver driver)
	{
		this.driver=driver;
	
		PageFactory.initElements(driver,this );
		
	}
	@FindBy(xpath="//*[@id=\"searchDropdownBox\"]")
	WebElement DropDownMenu;
	
	public WebElement getDropDownMenu()
	{
		return DropDownMenu;
	}
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement SearchField;
	public WebElement getSearchField()
	{
		return SearchField;
	}
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement SearchButton;
	public  WebElement getSearchButton()
	{
		return SearchButton;
	}

	@FindAll(@FindBy(xpath="//span[contains(text(),'The Da Vinci Code')]"))
	List<WebElement> titleOfTheBooks;
	public List<WebElement> getTitleOfTheBook() {
		return titleOfTheBooks;
	}
	
	@FindAll(@FindBy(xpath="//span[@class='a-price-whole']"))
	List<WebElement> itemPrices;
	public List<WebElement> getItemPrices() {
		return itemPrices;
	}

	
	@FindAll(@FindBy(xpath="//span[@class='a-size-base-plus a-color-base a-text-normal']"))
	List<WebElement> items;

	public List<WebElement> getItems() {
		return items;
	}


	
	

}
