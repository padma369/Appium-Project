package xpathAsixExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpath_axis_example_following_preceding {

	@Test
	public void XPATHAsix() throws Exception {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.lambdatest.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Locate element using following axes
		driver.findElement(By.xpath("//input[@name='name']//following::input[1]")).sendKeys("rajesh@gmail.com");

		Thread.sleep(2000);
		
		//Locate element using preceding axes
		driver.findElement(By.xpath("//input[@name='email']//preceding::input[1]")).sendKeys("Rajesh Singh");

		Thread.sleep(2000);
		//locating the 'Terms of Service' link using xpath following sibling and clicking on it.
        driver.findElement(By.xpath("//a[contains(@href,'privacy')]//following-sibling::a[contains(text(),'Service')]")).click();
        
        //Another way
        //driver.findElement(By.xpath("//a[contains(@href,'privacy')]//following-sibling::a[1]")).click();
        
        //locating the 'privacy policy' link using xpath following sibling and clicking on it.
        //1st
        //driver.findElement(By.xpath("//a[contains(text(),'Service')]//preceding-sibling::a[contains(@href,'privacy')]")).click();
        
        //2nd - Another way
        //driver.findElement(By.xpath("//a[contains(text(),'Service')]//preceding-sibling::a[1]")).click();
		
		//driver.close();
		driver.quit();
        
	}

}
