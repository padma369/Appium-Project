package basicTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HRMLogin {

	
	@Test
	public void verifyLoginLogoutTest() throws Exception {
		
		//driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Act\\Downloads\\chromedriver_win32_106\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 			// REST API --- api ---- data
		
		
		
		
		//driver.perform(null);
		
		Thread.sleep(5000);   //hard-coded delay
		
		driver.close();
		
		
		
	}
	
}
