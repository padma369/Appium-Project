package syncIssue;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleApp_ConditionalWait {

	
	@Test
	public void verifyLoginLogoutTest() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit wait  -------- any elememt
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html"); 		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		//Explicit Wait
		//wait for specific condition
		
		WebDriverWait wait = new WebDriverWait(driver, 60);					//max time
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));
		
		

		WebElement txt_box = driver.findElement(By.cssSelector("#text3"));					
		txt_box.sendKeys("enter value Admin.......");
		
		
		
		driver.close();
		
		
		
	}
	
}
