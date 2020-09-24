package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//@FindBy(linkText = "/en-in/weather")
	//WebElement weather;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/a[2]")
	WebElement weather;
	//@FindBy(linkText = "/en-in/lifestyle/travel")
	//WebElement travel;
	@FindBy(xpath="/html/body/nav/div[1]/ul[2]/li[4]/a")
	WebElement travel;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/a[2]")
	WebElement lifeStyle;
	@FindBy(xpath="/html/body/nav/div[2]/div[2]/ul/li[1]/a")
	WebElement travelLifeStyle;
	
	@FindBy(xpath = "/html/body/nav/div[2]/div[2]/ul/li[3]/a")
	WebElement flightSearch;
	public void clickHeaderMenu() throws InterruptedException
	{
		weather.click();

		System.out.println("Weather clicked");
		Thread.sleep(1000);
		travel.click();
		System.out.println("Travel clicked");
		Thread.sleep(1000);

	}
	
	public void clickMoreOnLifeStyle() throws InterruptedException
	{
		lifeStyle.click();

		System.out.println("LifeStyle clicked");
		Thread.sleep(1000);
		travelLifeStyle.click();
	}
	
	public void clickFindFlight() throws InterruptedException
	{
		lifeStyle.click();
		System.out.println("Travel under LifeStyle clicked");
		flightSearch.click();
		System.out.println("Flight Search clicked");
		Thread.sleep(1000);
	}
	
	
	
}
