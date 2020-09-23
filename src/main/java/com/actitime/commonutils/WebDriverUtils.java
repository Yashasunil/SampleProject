package com.actitime.commonutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {
	WebDriver driver;
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fisobj=new FileInputStream("./src/main/resources/LoginData/LoginCreds.properties");
		Properties obj=new Properties();
		obj.load(fisobj);
		String value = obj.getProperty(key);
		return value;	
	}
	public void captureFailedScreenshots(String tcname, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\FailedScriptsScreenshots\\"+tcname+".png");
		FileUtils.copyFile(src, dest);
		System.out.println("Screen shot taken");
	}
}	
