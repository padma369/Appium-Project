package actionExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropTest {

	public WebDriver driver;

	@BeforeTest
	public void launchApp() {

		System.out.println("launching .....");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
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

		
		WebElement dragdropFrame = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo')]"));
		driver.switchTo().frame(dragdropFrame);
		
		//Method1
		
		WebElement img3 = driver.findElement(By.xpath("//img[contains(@src,'tatras3')]"));
		WebElement img4 = driver.findElement(By.xpath("//img[contains(@src,'tatras4')]"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(img3, trash).perform();

		
		
		//Method2
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		//act.clickAndHold(img4).moveToElement(trash).release().perform();
		act.clickAndHold(img4).moveToElement(trash).release().build().perform();
		
		
//		Exercise
//		---------
		//act.moveToElement(img3).moveToElement(img3).click().perform();
		//act.moveToElement(img3).click(trash).perform();
		//act.moveToElement(img3).click(trash).build().perform();
		//validation
		
//		act.moveToElement(img3).perform();
//		act.click(trash).perform();
		
		
		
	}
	
	

}
