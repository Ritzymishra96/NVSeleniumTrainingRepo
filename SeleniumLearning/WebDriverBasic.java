package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		// FF Driver
		//To open FF Browser we need to use geckodriver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Desktop\\NV_Selenium_Jar\\FFDriver\\Driver\\geckodriver.exe");
		
		//Interface            Class
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		
	}

}
