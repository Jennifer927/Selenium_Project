package Selenium_package_jay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_search_bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the web page www.google.com
		browserObject.get("https://www.google.com/");
		
		// 4. Locate the search bar element and send values using sendkeys
		browserObject.findElement(By.name("q")).sendKeys("laptops");
		// 5. Locate the search button and perform click
		browserObject.findElement(By.name("btnK")).submit();


	}

}
