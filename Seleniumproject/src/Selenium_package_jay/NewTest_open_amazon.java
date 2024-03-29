package Selenium_package_jay;

import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;


public class NewTest_open_amazon {
  
	@Test
 
	  public void Open_and_Close_AmazonSite() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			// 3. Initialize WebDriver object through ChromeDriver class.
		        WebDriverDecorator browserObject = new ChromeDriver();
		        System.out.println("Open /close  amazon.com in chrome browser");
			 // 4. Open the web page http://www.amazon.com/ in first test case 
		        browserObject.get("http://www.amazon.com/");
			 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
		        Thread.sleep(2000);
			// 6. close the browser
		        browserObject.close();
	  
	  
  }
}
