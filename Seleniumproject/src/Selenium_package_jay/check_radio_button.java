package Selenium_package_jay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		// 7. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method	
        Thread.sleep(6000);
		
		browserObject.findElement(By.xpath("//input[@value='female']")).click();
		
		 browserObject.close();
		
		
		 
	}

}
