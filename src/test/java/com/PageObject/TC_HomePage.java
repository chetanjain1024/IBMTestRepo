package com.PageObject;

import java.io.IOException;
import org.testng.annotations.Test;

import com.TestCases.BaseClass;
import com.TestCases.Details;
import com.TestCases.HomePage;

public class TC_HomePage extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("URL is opened");
		System.out.println("browser opened");
		HomePage lp = new HomePage(driver);
		
		Details details= new Details(driver);

		Thread.sleep(5000);

		lp.clickHeaderMenu(); 
		logger.info("Weather clicked");
		Thread.sleep(5000);
		lp.clickMoreOnLifeStyle();
		logger.info("LifeStyle clicked");
		Thread.sleep(5000);

		logger.info("Travel clicked");

		Thread.sleep(3000);
		System.out.println("flight click method");
		Thread.sleep(2000);
		lp.clickFindFlight();
		logger.info("Button clicked");
		Thread.sleep(3000);

		details.setOriginCity(originCity);
		Thread.sleep(1000);
		details.setDestCity(destCity);
		Thread.sleep(1000);
		details.setDepartDate();
	}
}
