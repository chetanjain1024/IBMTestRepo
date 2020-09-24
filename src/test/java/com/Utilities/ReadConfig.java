package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src= new File ("./Configurations/config.Properties");
		try
		{
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			}
		catch (Exception e)
		{
		System.out.println("Exception is "+ e.getMessage());	
		}
	}
	
	public String getApplicationURL()
	{
		
		String url=pro.getProperty("baseURL");
				return url;
		
	}
	
	public String getchromepath()
	{
		
		String chromepath=pro.getProperty("chromepath");
		
				return chromepath;
	}
	
	public String getIEpath() {
		String iePath=pro.getProperty("iePath");
		return iePath;
	}
	
	public String getFirepath() {
		String firePath=pro.getProperty("firefoxpath");
		return firePath;
	}

	public String getOriginCity() {
		String originCity=pro.getProperty("originCity");
		return originCity;
	}

	public String getdestCity() {
		String destCity=pro.getProperty("destCity");
		return destCity;
	}
	
}
