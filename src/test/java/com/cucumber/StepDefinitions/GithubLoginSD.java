package com.cucumber.StepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Selenium.SeleniumFunctions;
import com.pageObject.github.GitHubPageObject;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginSD {

	//SeleniumFunctions sf = new SeleniumFunctions();
	GitHubPageObject po = new GitHubPageObject();

	@Given("^user is on github homepage$")
	public void user_is_on_github_homepage() throws MalformedURLException,
			InterruptedException {
		//sf.createDriver();
		po.createDriver();
		po.ishomepageDisplayed();
	}

	@When("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() {
		po.clickSigninLink();
	}

	@Then("^user is displayed login screen$")
	public void user_is_displayed_login_screen() {
		po.isloginsectionDisplayed();
		po.tearDown();
	}
	
	@When("^user focuses on Top Banner$")
	public void user_focuses_on_Top_Banner() throws Throwable {
		po.createDriver();
	}

	@Then("^user gets an option of home page$")
	public void user_gets_an_option_of_home_page() throws Throwable {
		
		po.driver.get("http://www.google.com");
		
		WebElement searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("cat");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("cat".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		po.tearDown();
	}


}
