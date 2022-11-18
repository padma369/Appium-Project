package actionExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWishListExample {

	public WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching .....");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@AfterTest
	public void closingApp() throws Exception {

		Thread.sleep(7000);
		driver.close();

		System.out.println("closing....");
	}

	@Test(priority = -1)
	public void rightClickTest() throws Exception {

		WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		//WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
		WebElement CreateWishList = driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
		//WebElement CreateWishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish')]"));
		

		Actions act = new Actions(driver);
		
		//move to element
//		act.moveToElement(signIn).perform();
//		act.moveToElement(CreateWishList).perform();
//		act.click().perform();
		
		
		//act.moveToElement(signIn).moveToElement(CreateWishList).click().perform();
//		
//		
		act.moveToElement(signIn).click(CreateWishList).perform();
		
		
		Assert.assertTrue(driver.getTitle().contains("Wish"));

	}
	
	

}
