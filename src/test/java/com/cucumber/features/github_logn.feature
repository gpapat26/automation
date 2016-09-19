Feature: github login
	
	@sanity
  Scenario: login without username and password
    Given user is on github homepage
    When user clicks on Sign in button
    Then user is displayed login screen
   
  @regression  
  Scenario: login without username2 and password2
    Given user is on github homepage
    When user clicks on Sign in button
    Then user is displayed login screen
    
    
  @dummy  
  Scenario: login without username3 and password3
    Given user is on github homepage
    When user clicks on Sign in button
    Then user is displayed login screen
    
    
  @koukou
	Scenario: Top Banner content
		When user focuses on Top Banner
		Then user gets an option of home page
		