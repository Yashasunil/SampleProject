package com.actitime.testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.commonutils.WebDriverUtils;
import com.actitime.configuration.CommonSetup;
import com.actitime.pages.HomePage;

public class VerifyHomeTitleTest extends CommonSetup 
{
	@Test
	public void verifyTitle() throws InterruptedException, IOException
	{
		 HomePage hp = new HomePage(driver);
		 WebDriverUtils wt = new WebDriverUtils();
		 Thread.sleep(4000);
		 if(driver.getTitle().contains("hello"))
		 {
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 wt.captureFailedScreenshots("VerifyHomeTitleTest", driver);
			 Assert.assertTrue(false);
		 }
	}
	

}
