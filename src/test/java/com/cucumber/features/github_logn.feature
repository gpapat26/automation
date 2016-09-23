Feature: github login
	
	@sanity
  Scenario: login without username and password
    Given user1 is on github homepage
    When user1 clicks on Sign in button
    Then user1 is displayed login screen
   
  @regression  
  Scenario: login without username2 and password2
    Given user2 is on github homepage
    When user2 clicks on Sign in button
    Then user2 is displayed login screen
    
    
  @dummy
  Scenario: login without username3 and password3
    Given user3 is on github homepage
    When user3 clicks on Sign in button
    Then user3 is displayed login screen
    
 
  @koukou 
	Scenario: Top Banner content
		When user focuses on Top Banner
		Then user gets an option of home page
		
		
	@stupid 
	Scenario: not do anything usefull
		When  i am ok
		Then  I ll go play football
		