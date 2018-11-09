package com.demos1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;

public class Sauceslabtest {
	
	public static final String USERNAME = "naveen_test";
	public static final String ACCESS_KEY = "755b3b58-b389-4740-9743-cdcd0117a1e3";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static WebDriver driver;
	private String sessionId;
	 public String getSessionId() {
	        return sessionId;
	    }
	 @Parameters({ "browser", "browPlatform","browVersion" })
	 @Test(priority=1)
	  public  void laucnBrowser(String browser, String browPlatform, String browVersion) throws Exception {
		 DesiredCapabilities caps = new DesiredCapabilities();
		  if(browser.equalsIgnoreCase("chrome")){
		     caps = DesiredCapabilities.chrome();
		  }
		  else if(browser.equalsIgnoreCase("ff")){
			   caps = DesiredCapabilities.firefox();
		  }
		  else{
			  System.out.println("oopps");
		  }
		    caps.setCapability("platform", browPlatform);
		    caps.setCapability("version", browVersion);
		    driver = new RemoteWebDriver(new URL(URL), caps);
	        //this.sessionId = (((RemoteWebDriver) driver).getSessionId()).toString();
	        
}
	 @Test(priority=2)
	 public void testcase(){
		 driver.get("https://www.amazon.com/");
		 driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		 driver.quit();
	 }
}