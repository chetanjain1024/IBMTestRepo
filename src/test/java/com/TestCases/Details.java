package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Details {
WebDriver ldriver;
	
	public Details(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//@FindBy(xpath="/html/body/div[4]/div/main/div/div[4]/div[4]/div/div[5]/section/div[7]/div[1]/div[3]/div/div/div/input")
	@FindBy(xpath="//input [@class='place-selector__input js-place-input']")
	WebElement fromCity;
	
	
	public void setOriginCity(String city) throws InterruptedException
	{
		System.out.println("----- In origin City");
		fromCity.clear();
		fromCity.sendKeys(city);
		Thread.sleep(1000);
	}
		
	
	@FindBy(xpath="/html/body/div[4]/div/main/div/div[4]/div[4]/div/div[5]/section/div[7]/div[1]/div[4]/div/div/div/input")
	WebElement destCity;
	public void setDestCity(String city) throws InterruptedException
	{
		System.out.println("----- In destination City");
		destCity.clear();
		destCity.sendKeys(city);
		Thread.sleep(1000);
	}
	@FindBy(xpath="/html/body/div[4]/div/main/div/div[4]/div[4]/div/div[5]/section/div[7]/div[2]/div[2]/div[1]/button/div[2]")
	WebElement calDepart;
	@FindBy(xpath="/html/body/div[4]/div/main/div/div[4]/div[4]/div/div[5]/section/div[7]/div[2]/div[2]/div[2]/div/div/div/div/div[4]/button[5]/span[2]")
	WebElement calendarDate;
	public void setDepartDate() throws InterruptedException
	{
		calDepart.click();
		Thread.sleep(1000);
		calendarDate.click();
		Thread.sleep(1000);
	}
	@FindBy(xpath="/html/body/div[2]/form/div[11]/div/input")
	WebElement btnPurchaseFlight;	
	
	@FindBy(xpath="/html/body/div[4]/div/main/div/div[4]/div[4]/div/div[5]/section/div[7]/div[3]/div[2]/div[1]/div/button/div")
	WebElement male;
	
	@FindBy(xpath="/html/body/div[4]/div/main/div/div[4]/div[4]/div/div[5]/section/div[7]/div[3]/div[2]/div[2]/div/button/div")
	WebElement female;
	@FindBy(xpath="/html/body/div[4]/div/main/div/div[4]/div[4]/div/div[5]/section/div[7]/div[3]/div[2]/div[4]/div/button/div")
	WebElement child;
	
	public void selectPassengers() throws InterruptedException
	{
		System.out.println("In passeengers selection section");
		Thread.sleep(1000);
		Select select = new Select(male); 
		select.selectByVisibleText("1");
		Thread.sleep(1000);
		select= new Select(female);
		select.selectByVisibleText("1");
		Thread.sleep(1000);
		select= new Select(child);
		select.selectByVisibleText("1");
		Thread.sleep(1000);
		
		System.out.println(" no of passengers selected ");
	}
	
	@FindBy(xpath="/html/body/div[4]/div/main/div/div[4]/div[4]/div/div[5]/section/div[7]/a/span")
	WebElement searchbtn;
	public void PurchaseFlight()
	{
		searchbtn.click();
	}
}
