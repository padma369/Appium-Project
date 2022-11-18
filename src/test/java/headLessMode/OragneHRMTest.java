package headLessMode;


import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OragneHRMTest{

	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.out.println("*****pre-condition*****");

		WebDriverManager.chromedriver().setup(); 
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		
		
		//option.addArguments("--ignore-certificate-errors");
		//option.addArguments("--headless", "--window-size=1920,1200");
		//option.addArguments("--headless");
		
		
		driver = new ChromeDriver(option);
		
		
		
		
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@AfterTest
	public void teardown() throws Exception {

		System.out.println("*****post-condition*****");
		Thread.sleep(4000);
		driver.close();

	}

	@Test
	public void HeadlessMode() throws Exception {

		String actualTitle = driver.getTitle();
		System.out.println("Title : " + actualTitle);
		
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		WebElement btnLogin = driver.findElement(By.className("button"));
		btnLogin.click();
		
		Thread.sleep(2000);
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Myscreenshot/MyScreenshot1_login.png");
		FileUtils.copyFile(screenshotFile, destFile);
		
		Assert.assertTrue(actualTitle.contains("Google"), "verification of application title failed");
		//Assert.assertTrue(false, "your own message---- printed only for failed scenario");
		//Assert.assertTrue(false);
		
		//take screenshot
		
		
		
	}

}
