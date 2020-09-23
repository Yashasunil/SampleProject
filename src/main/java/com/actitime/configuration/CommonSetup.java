package com.actitime.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSetup 
{
	public static WebDriver driver;
	public String url="https://demo.actitime.com/login.do";
	@BeforeClass
	//to create pre-condition method
	public void classsetup()
	{
		//chromedriver
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
	}
	
	@AfterClass
	//to create post-condition method
	public void classteardown()
	{
		driver.close();
	}

}
