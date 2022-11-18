package exercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utility.ConfigRead;

public class AmazonTestCrossBrowser {

	WebDriver driver;
	
	@Test
	public void verifySearchFeature() throws Exception {

		//create an object
		ConfigRead conf = new ConfigRead();
		
		String browser = conf.getBrowser();
		String url = conf.getAmazonApp();
		
		System.out.println("Browser Execution : " + browser);
		System.out.println("App URL : " + url);
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Act\\Downloads\\chromedriver_win32_106\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Act\\Downloads\\edgedriver_win64_106\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Act\\Downloads\\chromedriver_win32_106\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Act\\Downloads\\edgedriver_win64_106\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		
		else {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Act\\Downloads\\chromedriver_win32_106\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		
		
		
		
		
		
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.get(url);
		
		String searchItem = "iphone 14";
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(5000);
		//validation step
		String appTitle = driver.getTitle();
		System.out.println("Application title after search item: " + appTitle);
		
		Assert.assertEquals("Amazon.in : iphone 14", appTitle);
		Assert.assertEquals("Amazon.in : " + searchItem, appTitle);
		System.out.println(appTitle.contains(searchItem));
		Assert.assertTrue(appTitle.contains(searchItem));
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
