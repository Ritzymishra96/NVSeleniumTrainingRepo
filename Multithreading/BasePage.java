package Multithreading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public WebDriver driver;
	
	//init driver
	
	public WebDriver setUp(String browserName) throws InterruptedException {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\NV_Selenium_Jar\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Desktop\\NV_Selenium_Jar\\FFDriver\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		driver.get("http://www.google.com");
		Thread.sleep(100);
		driver.manage().window().maximize();
		return driver;
		
		
	}

}
