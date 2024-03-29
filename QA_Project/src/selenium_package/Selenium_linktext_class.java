package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_linktext_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver a = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        a.get("https://www.google.com/");
	        
	        WebElement gmail= a.findElement(By.linkText("Gmail"));
	        
	        if(gmail.isDisplayed())
	        {
	        	System.out.println("The gmail text is displayed ");
	        }
	        else
	        {
	        	System.out.println("The gmail is not displayed");
	        }

	}

}
