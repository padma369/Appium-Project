package syncIssue;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLogin_Exercise1 {

	
	@Test
	public void verifyLoginLogoutTest() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit wait  -------- any elememt
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		

		WebElement txt_UserName = driver.findElement(By.name("username"));					
		txt_UserName.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
		
		//driver.close();
		
		
		
	}
	
}
