package Selenium_package_jay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 3. Initialize WebDriver object through ChromeDriver class.
	    ChromeDriver    browserObject = new ChromeDriver();
	        System.out.println("Open /close  cnn.com in chrome browser");
		 // 4. Open the web page http://www.cnn.com/ in first second case 
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        
	        WebElement email=browserObject.findElement(By.name("Email"));
	      
	       email.clear();
	        email.sendKeys("admin@yourstore.com");
	        
	        WebElement pass= browserObject.findElement(By.name("Password"));
	        pass.clear();
	        pass.sendKeys("admin");
	        
	        browserObject.findElement(By.className("button-1")).click();
	}

}
