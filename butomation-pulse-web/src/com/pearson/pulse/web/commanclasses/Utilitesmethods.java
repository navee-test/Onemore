package com.pearson.pulse.web.commanclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilitesmethods {

	public static WebDriver driver;
	
	public static void launchBrowser(String browserName){
		if(browserName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver= new FirefoxDriver();
		}
		else
			System.out.println("Browser not found");
	}
	
	
}
