package handleWindows;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public WebDriver driver;
	
	@BeforeTest
	public void launchApp() {

		System.out.println("launching .....");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");

	}

	@AfterTest
	public void closingApp() throws Exception {

		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		
		System.out.println("closing....");
	}
	

}
