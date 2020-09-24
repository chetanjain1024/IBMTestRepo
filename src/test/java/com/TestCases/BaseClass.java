package com.TestCases;
import com.Utilities.ReadConfig;

import java.io.FileInputStream;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String originCity=readconfig.getOriginCity();
	public String destCity=readconfig.getdestCity();
	public static WebDriver driver ;
	public static Logger logger;
	FileInputStream inputStream;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		System.out.println(baseURL);
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		logger=Logger.getLogger("IBM test");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath() );
		driver=new ChromeDriver();
		}
		if(br.equals("ie"))
		{
		System.setProperty("webdriver.ie.driver",readconfig.getIEpath() );
		driver=new InternetExplorerDriver();
		}
		if(br.equals("Firefox"))
		{		System.setProperty("webdriver.gecko.driver",readconfig.getFirepath() );
		driver=new FirefoxDriver();
		}
		
	}
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
}
