package com.demos1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralletesting {
	
	public static WebDriver driver;
	
	@Test
	@Parameters("browser1")
	public static void launchBrowser1(String browser1){
		if(browser1.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D://temp//butomation-pulse-web//driv//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser1.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "D://temp//butomation-pulse-web//src//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browser1.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "D://temp//butomation-pulse-web//driv//MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		else
			System.out.println("browser not found");
	}

}
