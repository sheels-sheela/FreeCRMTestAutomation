package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath=" //*[@id='gh-shop-a']")
	WebElement shopByCategory;
	
	@FindBy(xpath="//a[text()='Cell phones & accessories']")
	WebElement cellPhonesNAccessories;
	
	@FindBy(xpath="//a[text()='Cell Phones & Smartphones']")
	WebElement cellPhonesAndSmartPhones;
	
	@FindBy(xpath="//span[text()='Network']")
	WebElement network;
	
	@FindBy(xpath="(//*[text()='see all'])[1]")
	WebElement seeAll;
	
	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyEbayShopByCategoryPage() {
		return shopByCategory.isDisplayed();
		
	}
	
	public boolean verifyEbayCellPhonesAndAccessories() {
		return cellPhonesNAccessories.isDisplayed();
		
	}
	
	public void clickOnCellPhonesAndAccessories() {
		
		Actions action = new Actions(driver);
		action.moveToElement(cellPhonesNAccessories).build().perform();
		cellPhonesNAccessories.click();
	}
	
	public boolean verifyEbayCellPhonesAndSmartPhones() {
		return cellPhonesAndSmartPhones.isDisplayed();
		
	}
	
	public void clickOnCellPhonesAndSmartphones() {
		Actions action = new Actions(driver);
		action.moveToElement(cellPhonesAndSmartPhones).build().perform();
		cellPhonesAndSmartPhones.click();
		
	}
	
	public boolean verifyEbayseeAll() {
		return seeAll.isDisplayed();
		
	} 
	
	public void clickOnSeeAllLink() {
		Actions action = new Actions(driver);
		action.moveToElement(seeAll).build().perform();
		seeAll.click();
		
	}
	
	public boolean verifyEbayNetwork() {
		return network.isDisplayed();
		
	}
	
	
	public void clickOnNetWork() {
		Actions action = new Actions(driver);
		action.moveToElement(network).build().perform();
		network.click();
		
	}
	
	
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	
	
	
	
	
	
	

}
