package com.demos1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Seetestparalle {
	
	@Parameters("deviceID")
	@Test
	public void paralle(String deviceID) throws MalformedURLException{
		if(deviceID.equalsIgnoreCase("ios")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("generateReport", false);
			capabilities.setCapability(MobileCapabilityType.UDID,"e5ea3219b29fd512b147e2c09bf3171a636eb05f");
			capabilities.setCapability("accessKey","eyJ4cC51Ijo1MCwieHAucCI6MiwieHAubSI6Ik1UVXpNelUyTVRZM056ZzBNUSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE4NDg5MjE2NzgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.3B8O0hSUmD_UvtNe4RHMdlvokwU56gGvOWkeDp9Uf60");
			capabilities.setCapability(MobileCapabilityType.APP, "cloud:com.pearson.mobile.readerplus");
			AppiumDriver driver = new IOSDriver(new URL("https://pearsonlab.cognizant.com/wd/hub"), capabilities);
			driver.quit(); //e5ea3219b29fd512b147e2c09bf3171a636eb05f
		}
		else if(deviceID.equalsIgnoreCase("android")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("generateReport", false);
			capabilities.setCapability(MobileCapabilityType.UDID,"6373f0fa174a10919b53c428a122550338e96dc1");
			capabilities.setCapability("accessKey","eyJ4cC51Ijo1MCwieHAucCI6MiwieHAubSI6Ik1UVXpNelUyTVRZM056ZzBNUSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE4NDg5MjE2NzgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.3B8O0hSUmD_UvtNe4RHMdlvokwU56gGvOWkeDp9Uf60");
			capabilities.setCapability(MobileCapabilityType.APP, "cloud:com.pearson.mobile.readerplus");
			//AppiumDriver driver = new AndroidDriver(new URL("https://pearsonlab.cognizant.com/wd/hub"), capabilities);
			AppiumDriver driver = new IOSDriver(new URL("https://pearsonlab.cognizant.com/wd/hub"), capabilities);
		}
		else{
			System.out.println("not found");
		}
	}

}
