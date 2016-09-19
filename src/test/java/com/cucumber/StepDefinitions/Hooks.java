package com.cucumber.StepDefinitions;



import com.cucumber.Selenium.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
//HOOKS ARE VERY TRICKY AND SHOULD BE AVOIDED FOR INSTANTIATING THE DRIVER!!!!
//ONLY FOR CREATING DATA, OR OTHER THINGS!!!
public class Hooks {
	
	

	//@Before("@sanity,@regression,@dummy")
	public void taggedHookMethod1() throws InterruptedException {
		System.out.println("inside hook");
	//	DriverFactory.createDriver();
	}
	/*
	@Before({"@sanity,@regression"})
	public void taggedHookMethod2() {
	System.out.println("tagged hook - Sanity AND Regression");
	}
	*/
	/*
	@Before({"@important","~@regression"})
	public void taggedHookMethod3() {
	System.out.println("Tagged hook- important but NOT regression");
	}*/
	/*
	@Before({"@important","@regression,@wip"})
	public void taggedHookMethod4() {
	System.out.println("Tagged hook - (important+Rgression) OR (important AND wip)");
	}
	*/
	
	//@After
	public void tearDown() {

		//System.out.println("Inside After");
	//.tearDown();
	}

}
