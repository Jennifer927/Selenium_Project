package Selenium_package_jay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_fill_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserObject;
		  //1. setup the property of chromedriver to pass value to form input box through chrome web browser.
		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
		    // 2. Initialize Webdriver object through ChromeDriver class.
		    browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		    
		    // sending text to the input box in the web form--------------
		    // 4. Locate Name section using name locator and send values using sendkeys
		    browserObject.findElement(By.name("name")).sendKeys("Jennifer Joseph");
		    browserObject.findElement(By.name("email")).sendKeys("jenniferjohnjoseph@yahoo.com");
		    browserObject.findElement(By.name("website")).sendKeys("itlearn360.com");
		    browserObject.findElement(By.name("comment")).sendKeys("it is a good site");
		    browserObject.findElement(By.id("alert")).click();
		    browserObject.findElement(By.className("button-1")).click();

	}

}
