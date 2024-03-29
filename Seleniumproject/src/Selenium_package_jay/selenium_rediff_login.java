package Selenium_package_jay;//This program will open mail rediff login page and finding a webelement who's name is Login and sending the value.

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_rediff_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    
				//It setup property of chromedriver and locate the chrome drive
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
				
				// Create a object named 'browserObject'
			        ChromeDriver browserObject = new ChromeDriver();
			        
				// Open the http://www.mail.rediff.com/ link using get method.
			        browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
			        
			    // Maximize the window    
			        browserObject.manage().window().maximize();
		//It will find login box using locator and type the login charachers
				 browserObject.findElement(By.name("login")).sendKeys("Dhunkia");
				 
				//It will find password box using locator and type the password charachers
				 browserObject.findElement(By.name("passwd")).sendKeys("Ccc12354");
				 
				//Thread.sleep is used to hold the part of code for given time limit. 
			        Thread.sleep(3000);
				 
				 				  browserObject.findElement(By.name("proceed")).click();
				   
				 
				    
				   // Close the web browser.
				    browserObject.close();
			}

		

	}


