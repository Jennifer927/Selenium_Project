package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_open_website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        ChromeDriver a = new ChromeDriver();
			// 3. Open the http://www.google.com/ link using get method.
		        a.get("http://www.itlearn360.com/");

	}

}
