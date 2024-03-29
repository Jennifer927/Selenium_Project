package Selenium_package_jay;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_search_google_python {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Sets the system property to specify the path to the chromedriver
				 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
					
				    // Create the object name 'browserObject' for ChromeDriver class
				  ChromeDriver  browserObject = new ChromeDriver();
				  
				    // This code Open google.com page using 'get' method 
				    browserObject.get("https://www.google.com/");
				    
				    
				    
				    //Locate the search bar element by name and send desired values
				    browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
				    
				    Thread.sleep(2000);

				    
				    //Locate the search button by name and perform click
				    browserObject.findElement(By.name("btnK")).submit();
				    
				    browserObject.close();

	}

}
