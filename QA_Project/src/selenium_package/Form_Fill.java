package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_Fill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver a = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        a.get("http://training.qaonlinetraining.com/testPage.php");
	        a.findElement(By.name("name")).sendKeys("Jennifer");
	      a.findElement(By.name("email")).sendKeys("jenniferjohnjoseph@yahoo.com");
	      a.findElement(By.name("website")).sendKeys("www.amazon.com");
	      a.findElement(By.name("comment")).sendKeys("I am very Happy");
	      
	     // Radio Button
	    a.findElement(By.xpath("//input[@value='female']")).click();
	    Thread.sleep(5000);
	    a.findElement(By.xpath("/html/body/form/input[5]")).click();
	    
	    
	    
	    // checkbox 
	    a.findElement(By.xpath("/html/body/form/input[7]")).click();
	    a.findElement(By.xpath("/html/body/form/input[9]")).click();
	    
	    // dropdown 
	    WebElement cn = a.findElement(By.name("country"));
	    Select country= new Select(cn);
	    country.selectByVisibleText("Ethiopia");
	    
	    WebElement sk= a.findElement(By.name("skill"));
	    Select skill = new Select(sk);
	    skill.selectByVisibleText("Programming");
	    skill.selectByVisibleText("Database");
	      		 a.findElement(By.name("submit")).click();
	      		 
	      
	        
		        
	}

}
