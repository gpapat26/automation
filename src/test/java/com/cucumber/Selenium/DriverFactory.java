package com.cucumber.Selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 Driver Class to get driver according to browser
 */
public class DriverFactory {

	public   WebDriver driver = null;
	public   WebDriverWait waitVar = null;
	public   int waitTime = 10;

	public   String browser = "firefox";
	public   String baseURL = "https://github.com/";
	public   Platform currentOS = Platform.getCurrent();

	public String testName;
	public String ClassName = null;
	public String NewFileNamePath = null;
	


	public   void createDriver() throws InterruptedException {

		System.out.println("Browser= " + browser);
		System.out.println("Platform= " + currentOS);
		System.out.println("URL= " + baseURL);

		initateDriver();
		OpenURL(baseURL);
		Thread.sleep(2000);
	}

	public   void initateDriver() {
		System.out.println("trying to create browser");
		
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		driver = new FirefoxDriver(ffBinary,firefoxProfile);
		//driver = new FirefoxDriver(); 
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
