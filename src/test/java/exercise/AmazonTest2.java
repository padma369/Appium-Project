package exercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;

public class AmazonTest2 {

	@Test
	public void verifySearchFeature() throws Exception {

		//create an object
		ConfigRead conf = new ConfigRead();
		
		String browser = conf.getBrowser();
		String url = conf.getAmazonApp();
		
		System.out.println("Browser Execution : " + browser);
		System.out.println("App URL : " + url);
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Act\\Downloads\\chromedriver_win32_106\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.get(url);
		
//		String searchItem = "iphone 14";
//		
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		
//		Thread.sleep(5000);
//		//validation step
//		String appTitle = driver.getTitle();
//		System.out.println("Application title after search item: " + appTitle);
//		
//		Assert.assertEquals("Amazon.in : iphone 14", appTitle);
//		Assert.assertEquals("Amazon.in : " + searchItem, appTitle);
//		System.out.println(appTitle.contains(searchItem));
//		Assert.assertTrue(appTitle.contains(searchItem));
		
		
		driver.findElement(By.xpath("//h2[contains(text(),\"Women's fashion\")]//parent::div//following-sibling::div[contains(@class,'foo')]//child::a[text()='See all offers']")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.close();

	}

}
