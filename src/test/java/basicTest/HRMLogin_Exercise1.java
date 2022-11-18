package basicTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HRMLogin_Exercise1 {

	
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
		WebElement txt_UserName = driver.findElement(By.name("username"));					//unique 
		
		
		//action
		
		txt_UserName.sendKeys("Admin");
		System.out.println("Tagname of username field: " +txt_UserName.getTagName());
		System.out.println("Placeholder of username field: " + txt_UserName.getAttribute("placeholder"));
		
		
		
		//name - password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Tagname
		//click on Login button
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000); 
		//validation Step
		
		String actualAppURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		System.out.println("Application Title: " + actualTitle);
		System.out.println("Application URL after login: " + actualAppURL);
		
		//verify application URL
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList", actualAppURL);
		
		WebElement lbl_PIM = driver.findElement(By.tagName("h6"));
		
		System.out.println("is PIM label displayed on page: " + lbl_PIM.isDisplayed());
		
		//verify element present on page
		Assert.assertTrue(lbl_PIM.isDisplayed());
		
		//verify element Text
		System.out.println("Text value are : " + lbl_PIM.getText());
		Assert.assertEquals("PIM", lbl_PIM.getText());
		
		
		
		//click on user dropdown element 
		//Class - oxd-userdropdown-name
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		Thread.sleep(5000); 
		
//		//linkText
//		driver.findElement(By.linkText("Logout")).click();
		
		
		//linkText
		driver.findElement(By.partialLinkText("Logo")).click();
		
		
		//validation Step
		
		Thread.sleep(5000); 
		System.out.println("validation after successful logout");
		
		System.out.println("is LoginButton displayed on page: " + driver.findElement(By.tagName("button")).isDisplayed());
		//verify element present on page
		Assert.assertTrue(driver.findElement(By.tagName("button")).isDisplayed());
		
		Assert.assertEquals("submit", driver.findElement(By.tagName("button")).getAttribute("type"));
		
		Thread.sleep(5000);   //hard-coded delay
		
		driver.close();
		
		
		
	}
	
}
