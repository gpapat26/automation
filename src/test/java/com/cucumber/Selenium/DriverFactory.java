package com.cucumber.Selenium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 Driver Class to get driver according to browser
 */
public class DriverFactory {

	public   WebDriver driver ;
	public   WebDriverWait waitVar = null;
	public   int waitTime = 10;

	public   String browser = "firefox";
	public   String baseURL = "https://github.com/";
	public   Platform currentOS = Platform.getCurrent();

	public String testName;
	public String ClassName = null;
	public String NewFileNamePath = null;
	


	public   void createDriver() throws InterruptedException, MalformedURLException {

		System.out.println("Browser= " + browser);
		System.out.println("Platform= " + currentOS);
		System.out.println("URL= " + baseURL);
		
		//Run Local
		//initateDriver();
		//Run remotly
		//initiateRemoteDriver();
		initateDriver();
		//OpenURL(baseURL);
		//Thread.sleep(2000);
	}

	public   void initateDriver() {
		System.out.println("trying to create browser");
		
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");	
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile ffprofile = profile.getProfile("automation");		
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);	      
		driver = new FirefoxDriver(ffBinary,ffprofile);		
		//driver.get("http://google.com");
		
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		driver = new FirefoxDriver(capabilities);
		
//		 System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
//		 DesiredCapabilities capabilities=DesiredCapabilities.firefox();
//		 capabilities.setCapability("marionette", true);
//		 driver = new MarionetteDriver(capabilities);
//		
	}
	
	public void initiateRemoteDriver() throws MalformedURLException{
		
		//Node param to add:
        //-Dwebdriver.gecko.driver="C:\geckodriver\geckodriver.exe
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		capabilities.setCapability("marionette", true);		

	    driver = new RemoteWebDriver(
                   new URL("http://localhost:4444/wd/hub"), 
                   capabilities);
	}

	public   void OpenURL(String baseURL) {
		driver.manage().window().maximize();

		driver.get(baseURL);

		waitVar = new WebDriverWait(driver, waitTime);
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}

	public  void tearDown() {
		if (!(driver == null)) {
			driver.quit();
			driver = null;
		}
	}
	
	public byte[] returnscreenShot()
	{
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	
}
