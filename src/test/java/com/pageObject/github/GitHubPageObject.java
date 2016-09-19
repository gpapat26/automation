package com.pageObject.github;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.Selenium.DriverFactory;

public class GitHubPageObject extends DriverFactory{

	
	public void ishomepageDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.linkText("Sign in")));

		driver.findElement(By.linkText("Sign in")).isDisplayed();
		driver.findElement(By.className("btn-theme-green"))
				.isDisplayed();
	}

	public void clickSigninLink() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	public void isloginsectionDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By
				.className("auth-form-body")));
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Create an account")));
	}
}
