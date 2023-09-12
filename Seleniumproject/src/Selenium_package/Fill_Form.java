package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Jennifer");
	        
	        browserObject.findElement(By.id("eml")).sendKeys("jennifer@gmail.com"); 
	        
	        browserObject.findElement(By.name("website")).sendKeys("www.itlearn360.com");
	        
	        
	        browserObject.findElement(By.name("comment")).sendKeys("It is a good website");
	        
	      
	        
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        
	        browserObject.findElement(By.xpath("//input[@value='male']")).click();
	        
	        browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
	        
	        WebElement a= browserObject.findElement(By.name("country"));
	    
	        
	        Select country= new Select(a);
	        country.selectByVisibleText("Ethiopia");
	        
	        browserObject.findElement(By.name("submit")).click();
	        
	        
	        
	        

	}

}
