
//This program will fill into google search inbox "laptop" and hit "Google search button" 
package Selenium_package_jay; // package name is Selenium_Examples

import org.openqa.selenium.By; //importing selenium By class
import org.openqa.selenium.WebDriver; //importing Selenium class WebDriver
import org.openqa.selenium.chrome.ChromeDriver; //Importing ChromeDriver class

public class selenium_codes_notes { //name of this program is Selenium_Google_Search

	public static void main(String[] args) {
		//code execution start after main method
		
								
			 // using chrome webdriver and specifying location of chromedriver on my machine
						System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
						// creating broweserObject. This object will be like WebDriver class
						WebDriver browserObject = new ChromeDriver();
						// 3. Open the web page www.google.com. Using get method of WebDriver class 
						browserObject.get("https://www.google.com/");
						//Locate the search bar element by name and send values "laptops" using sendkeys method
						browserObject.findElement(By.name("q")).sendKeys("laptops");
						// Locate the search button by name "btnk" and perform click
						browserObject.findElement(By.name("btnK")).submit();

	}

}
