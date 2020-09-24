package com.PageObject;

import java.io.IOException;

import org.testng.annotations.Test;

import com.TestCases.BaseClass;

import com.TestCases.HomePageNew;


public class TC_WeatherCheck extends BaseClass {
@Test
	public void weatherRecord() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("URL is opened");
		System.out.println("browser opened");
		HomePageNew hp = new HomePageNew(driver);
		Thread.sleep(3000);
		
		  hp.clickFacebookLike(); logger.info("FB like clicked"); Thread.sleep(2000);
		  
		  hp.clickCancel(); Thread.sleep(2000);
		 
		
		hp.twitterFollow();
		
		
		hp.closeNewWindow();
		
		hp.captureDelTemp();
		
		hp.captureBlrTemp();
		
		hp.compareTemp();
	}
}
