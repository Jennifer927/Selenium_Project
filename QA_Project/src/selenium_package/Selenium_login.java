package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver a = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        a.get("https://admin-demo.nopcommerce.com/login");
	        
	        WebElement email= a.findElement(By.name("Email"));
	      email .clear();
	        email.sendKeys(" admin@yourstore.com");
	        WebElement pass=a.findElement(By.name("Password"));
	        pass.clear();
	        a.findElement(By.name("Password")).sendKeys("admin");
	        a.findElement(By.className("button-1")).click();
	        
	        
	        

	}

}
