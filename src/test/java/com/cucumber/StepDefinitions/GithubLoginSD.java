package com.cucumber.StepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.pageObject.github.GitHubPageObject;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginSD {

	//SeleniumFunctions sf = new SeleniumFunctions();
	GitHubPageObject po = new GitHubPageObject();
	
	String valueAsProofTobeStoredbetweenMethods;

	@Given("^user1 is on github homepage$")
	public void user_is_on_github_homepage() throws MalformedURLException,
			InterruptedException {
		System.out.println("1 " +po.toString());
		System.out.println("Called Class 1" +this.toString());
		//sf.createDriver();
		po.createDriver();
		valueAsProofTobeStoredbetweenMethods = "Santa Clause";
		System.out.println(String.format("execute thread from  GIVEN user1 is on github homepage : %s",
                Thread.currentThread().getName()));
		
		//po.ishomepageDisplayed();
	}

	@When("^user1 clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() {
		System.out.println("2 " +po.toString());
		System.out.println("Called Class 2" +this.toString());
		System.out.println(String.format("execute thread from  WHEN user1 clicks on Sign in button : %s",
                Thread.currentThread().getName()));
		//po.clickSigninLink();
		
		//po.clickSigninLink();
		
		po.driver.get("http://www.google.com");
		
		WebElement searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys(valueAsProofTobeStoredbetweenMethods);
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith(valueAsProofTobeStoredbetweenMethods.toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		//po.tearDown();
		
		
	    
		for (int i=0;i<10;i++){
		searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bird");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bird".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		}
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bat");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bat".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("koala");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("koala".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("taxi");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("taxi".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		//po.tearDown();
	}

	@Then("^user1 is displayed login screen$")
	public void user_is_displayed_login_screen() {
		System.out.println("3 " +po.toString());
		System.out.println("Called Class 3" +this.toString());

		System.out.println(String.format("execute thread from  THEN user1 is displayed login screen : %s",Thread.currentThread().getName() ));
		//po.isloginsectionDisplayed();
		po.tearDown();
	}
	
	@Given("^user2 is on github homepage$")
	public void user2_is_on_github_homepage() throws MalformedURLException,
			InterruptedException {
		System.out.println(String.format("execute thread from  GIVEN user2 is on github homepage : %s",Thread.currentThread().getName() ));
		System.out.println("Called Class Some other 1" +this.toString());

		System.out.println("Some other po : " +po.toString());
		//sf.createDriver();
		po.createDriver();
		//po.ishomepageDisplayed();
	}

	@When("^user2 clicks on Sign in button$")
	public void user2_clicks_on_Sign_in_button() throws InterruptedException {
		//po.clickSigninLink();
		
		//po.clickSigninLink();
		System.out.println(String.format("execute thread from  WHEN user2 clicks on Sign in button : %s",Thread.currentThread().getName() ));
		System.out.println("Called Class Some other 2" +this.toString());
		po.driver.get("https://github.com/");		
		po.driver.findElement(By.linkText("Sign in")).isDisplayed();
		po.driver.findElement(By.className("btn-theme-green")).isDisplayed();
//		po.driver.findElement(By.linkText("Sign in")).click();
		WebDriverWait  wait = new WebDriverWait(po.driver, 15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By
//				.className("auth-form-body")));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Create an account")));
//		
		po.driver.findElement(By.className("form-control")).sendKeys("apple");
		
		WebElement searchField1 = po.driver.findElement(By.name("q"));
		searchField1.submit();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("current")));

		
		po.tearDown();		
		po.createDriver();
		
		
		po.driver.get("http://www.google.com");
		
		WebElement searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("rooster");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("rooster".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		//po.tearDown();
		
		
	    
		
		searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bird");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bird".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bat");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bat".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("koala");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("koala".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("taxi");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("taxi".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		//po.tearDown();
	}

	@Then("^user2 is displayed login screen$")
	public void use2_is_displayed_login_screen() {
		//po.isloginsectionDisplayed();
		System.out.println(String.format("execute thread from  THEN user2 is displayed login screen : %s",Thread.currentThread().getName() ));

		 po.tearDown();
	}
	
	
	@Given("^user3 is on github homepage$")
	public void user3_is_on_github_homepage() throws MalformedURLException,
			InterruptedException {
		System.out.println(String.format("execute thread from  GIVEN user3 is on github homepage : %s",Thread.currentThread().getName() ));

		//sf.createDriver();
		po.createDriver();
		//po.ishomepageDisplayed();
	}

	@When("^user3 clicks on Sign in button$")
	public void user3_clicks_on_Sign_in_button() throws InterruptedException {
		System.out.println(String.format("execute thread from  WHEN user3 clicks on Sign in button : %s",Thread.currentThread().getName() ));

		//po.clickSigninLink();
		
		//po.clickSigninLink();
		
		po.driver.get("https://github.com/");		
		po.driver.findElement(By.linkText("Sign in")).isDisplayed();
		po.driver.findElement(By.className("btn-theme-green")).isDisplayed();
//		po.driver.findElement(By.linkText("Sign in")).click();
		WebDriverWait  wait = new WebDriverWait(po.driver, 15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By
//				.className("auth-form-body")));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Create an account")));
//		
		po.driver.findElement(By.className("form-control")).sendKeys("pear");
		WebElement searchField1 = po.driver.findElement(By.name("q"));
		searchField1.submit();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("current")));
		
		po.tearDown();		
		po.createDriver();
		
		po.driver.get("http://www.google.com");
		
		WebElement searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("rooster");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("rooster".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		//po.tearDown();
		
		
	    
		
		searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bird");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bird".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bat");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bat".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("koala");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("koala".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("taxi");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("taxi".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		//po.tearDown();
	}

	@Then("^user3 is displayed login screen$")
	public void user3_is_displayed_login_screen() {
		//po.isloginsectionDisplayed();
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
		searchField.sendKeys("bird");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bird".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bat");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bat".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("koala");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("koala".toLowerCase());
		}
		});
		String []arr = {"cat","dog","balloon"};
		System.out.println("Page title is: " + po.driver.getTitle());
		
		for (int i=0;i<2;i++){
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys(arr[i]);
		final String value = arr[i];
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith(value.toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		}
		po.tearDown();
	}
	
	@When("^i am ok$")
	public void i_am_ok() throws Throwable {
		po.createDriver();
	}

	@Then("^I ll go play football$")
	public void i_ll_go_play_football() throws Throwable {
	  
		po.driver.get("http://www.google.com");
		
		WebElement searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bird");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bird".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		for (int i=0;i<10;i++){
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("bat");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("bat".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		}
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("koala");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("koala".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		
		//AGAIN
	    searchField = po.driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys("taxi");
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		searchField.submit();
		
		(new WebDriverWait(po.driver, 10)).until(new
		ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver driverObject) {
		return driverObject.getTitle().toLowerCase().
		startsWith("taxi".toLowerCase());
		}
		});
		
		System.out.println("Page title is: " + po.driver.getTitle());
		
		po.tearDown();
	}


}
