package com.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageNew {
	WebDriver ldriver;
	String deltemp;
	String blrtemp;

	public HomePageNew(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	///html/body/div/div/div/table/tbody/tr/td/div/div/button/span
	//@FindBy(xpath="//input [@title='Like https://www.facebook.com/msnindia's Page on Facebook']")
	@FindBy(xpath="/html/body/div/div/div/table/tbody/tr/td/div/div/button/span")	
	WebElement fbLike;

	@FindBy(xpath="//*[@id=\"follow-button\"]")
	WebElement twitter;

	@FindBy(xpath="/html/body/div[4]/div/main/div/div[1]/div[1]/section[1]/div[1]/span")
	WebElement delTemp;

	@FindBy(xpath="/html/body/div[4]/div/main/div/div[1]/div[1]/div[2]/div[1]/a")
	WebElement dropdown;

	@FindBy(xpath="/html/body/div[4]/div/main/div/div[1]/div[1]/div[2]/div[2]/div[1]/form/div[1]/input")
	WebElement city;

	@FindBy(xpath="/html/body/div[4]/div/main/div/div[1]/div[1]/section[1]/div[1]/span")
	WebElement blrTemp;

	public void clickFacebookLike() throws InterruptedException {
		System.out.println("----in like method");
		Thread.sleep(1000);
		JavascriptExecutor js =  (JavascriptExecutor)ldriver; 

		ldriver.manage().window().maximize();

		//js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("arguments[0].scrollIntoView();", fbLike);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);

		/*
		 * WebElement scroll = fbLike; Actions actions = new Actions(ldriver);
		 * actions.moveToElement(scroll); actions.click();
		 * actions.moveToElement(scroll).click().build().perform();
		 */
		fbLike.click();
		System.out.println("Facbook like clicked");
		Thread.sleep(2000);		
	}

	public void clickCancel() {
		// Perform the click operation that opens new window

		String winHandleBefore = ldriver.getWindowHandle();

		// Switch to new window opened

		for (String winHandle : ldriver.getWindowHandles()) {

			ldriver.switchTo().window(winHandle);

		}

		// Perform the actions on new window
		try
		{
			ldriver.close();
		}

		catch(Exception e)
		{

			e.printStackTrace();

			System.out.println("not close");

		}

		ldriver.switchTo().window(winHandleBefore);// Again I want to start code this old window

	}

	public void twitterFollow() throws InterruptedException {
		System.out.println("----In twitter method");
		Thread.sleep(1000);
		JavascriptExecutor js =  (JavascriptExecutor)ldriver; 

		ldriver.manage().window().maximize();

		//js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("arguments[0].scrollIntoView();", twitter);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		System.out.println("----- about to click on follow button");
		twitter.click();
		Thread.sleep(2000);

	}

	public void closeNewWindow() {
		// TODO Auto-generated method stub

	}

	public void captureDelTemp() {
		deltemp= delTemp.getText();
		System.out.println("Temp in Delhi is  " +deltemp+ "°C");
	}

	public void captureBlrTemp() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("In capture Banglore temp method");
		dropdown.click();
		city.sendKeys("Bengaluru, Karnataka, India");
		Thread.sleep(1000);
		city.sendKeys(Keys.ARROW_DOWN);
		city.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		blrtemp= blrTemp.getText();
		System.out.println("Temp in Bengluru is  " +blrtemp+ "°C");

	}

	public void compareTemp() {
		int blr= Integer.parseInt(blrtemp);
		int del= Integer.parseInt(deltemp);
		if (del>blr)
		{
			System.out.println(" Delhi is having more temp than Bengluru");
		}
		else
		{
			System.out.println(" Bengluru is having more temp than Delhi ");
		}
	}
}
