# TestNg integrated with Cucumber/Selenium

Below briefly  all the frameworks are connected:

* testNg => Improved annotations over JUnit, we can run with multiple thread, parallelism, etc
* Cucumber => Good test interpretable by nearly any kind of stackholders
  * It's integrated with TestNG extending the class **AbstractTestNGCucumberTests**
  * testng.xml points to the **TestRunner** class(from Cucumber)
* Selenium/WebDriver => to access web pages(in this example using Chrome)