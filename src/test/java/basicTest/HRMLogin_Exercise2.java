package basicTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HRMLogin_Exercise2 {

	
	@Test
	public void verifyLoginLogoutTest() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Act\\Downloads\\chromedriver_win32_106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 			// REST API --- api ---- data
		

		Thread.sleep(5000);
		
		//locators
//		id
//		name
//		className
//		tagname
//
//		linkText
//		partialLinkText
//
//		XPATH
//		CSS Selector
		
		
		//Identification
		
		//Name - UserName
		WebElement txt_UserName = driver.findElement(By.tagName("a"));					//5 match  ///default it can perform action on first one 
		
		//txt_UserName.sendKeys("hello");
		txt_UserName.click();
		
		
		Thread.sleep(5000);   //hard-coded delay
		
		driver.close();
		
		//driver.quit();
		
		
		
	}
	
}
