package basicTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HRMLogin_Edge {

	
	@Test
	public void verifyLoginLogoutTest() throws Exception {
		
		//driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Act\\Downloads\\edgedriver_win64_106\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 			// REST API --- api ---- data
		
		
		
		
		//driver.perform(null);
		
		Thread.sleep(5000);   //hard-coded delay
		
		driver.close();
		
		
		
	}
	
}
