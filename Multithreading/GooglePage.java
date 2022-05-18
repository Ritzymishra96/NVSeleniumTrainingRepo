package Multithreading;

import org.openqa.selenium.By;

public class GooglePage extends BasePage {
	
	//page actions:
	
	public void googlesearch() {
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("newvision software");
		driver.findElement(By.name("q")).submit();
	}
	
	public void tearDown() {
		driver.quit();
	}

}
