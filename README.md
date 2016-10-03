# Automation JVM-Cucumber-Jenkins-Parallel-Grid
1.Parallel automation with Cucumber-JVM and Jenkins Integration
2.Create 5 Scenarios that prove to run in parallel 
3.Each Thread creates its own Instance of the Step Definition Class and thus Driver objects and thus ui tests dont mix.
4.Instance variables are saved from step 1 to Step 2 (for same scenario)and thus can be re-used
5.Using initiateRemoteDriver() for Selenium Grid (1 hub and 1 node at localhost)

Current Task : Pass parameters from 1 scenario to another (Spring DI)

Next Task : Create 2 nodes with max 2 browsers. Start parallel execution of 4 scenarios
Next Task : Create 2 nodes with max 2 different browsers. Start parallel execution of 4 scenarios


# Browser Tested
Firefox version used : 46
