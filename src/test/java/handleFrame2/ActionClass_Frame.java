package handleFrame2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionClass_Frame extends BaseTest {

	
	@Test
	public void verifyFrame() throws Exception {
		
		Thread.sleep(3000);
		//click on Sign-In
		//driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		Thread.sleep(3000);
		
		//Frame - handling
		
		//driver.switchTo()
		
		
		//Index			--- start from 0
		//Name/ID
		//WebElement 
		
		
		driver.switchTo().frame(1);
		//driver.switchTo().frame("packageFrame");
		
//		WebElement myFrame = driver.findElement(By.xpath("//iframe[contains(@title,'All Packages')]"));
//		driver.switchTo().frame(myFrame);
		
		//validation step
		
		
//		String actualHeading = driver.findElement(By.cssSelector(".heading")).getText();
//		System.out.println(actualHeading);
//		
//		Assert.assertTrue(actualHeading.contains("Paytm Web account"));
//		//perform action on Watch Video
		//frame ----2
		String text = driver.findElement(By.xpath("//a[text()='Actions' and @target=\"classFrame\"]")).getText();
		Thread.sleep(3000);
		
		System.out.println(text);
		
		
		
		
		
		driver.switchTo().defaultContent();   			///out from first frame
		//frame---3
		
		WebElement nextFrame = driver.findElement(By.cssSelector("iframe[name='classFrame']"));
		
		driver.switchTo().frame(nextFrame);
		driver.findElement(By.cssSelector("a[href=\"#deselectByIndex(int)\"]")).click();
		
		
		
	}
	
	
	
}
