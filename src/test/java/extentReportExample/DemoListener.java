package extentReportExample;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//@Listeners(extentReportExample.ListenersDemo.class)
public class DemoListener {
	static WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority=0)
	public void OpenSite() {
		driver.get("https://www.amazon.in/");
	}

	@Test(priority=1)
	public void enterSearchValueOnPage() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	}

	@Test(priority=2)
	public void testToFail() {
		// System.out.println("This method is test to fail");
		String title = driver.getTitle();
		Assert.assertEquals(title, title.contains("iphone")); // Forcefully we will fail this
	}
}