package extentReportExample1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	
	
	@Test
	public void verifyAppTitle() {
		
		logger = extent.createTest("To verify application Google title");
		logger = extent.createTest("enter username");
		logger = extent.createTest("enter password");
		logger = extent.createTest("click on login button");
		Assert.assertEquals(driver.getTitle(),"Google");
		
	}

	
	
	@Test
	public void verifyAppLogo() {
		
		
		
		logger = extent.createTest("To verify application logo");
		
		Boolean img_present = driver.findElement(By.cssSelector("img[alt='Google']")).isDisplayed();
		
		
		logger.createNode("Image is present");
		Assert.assertTrue(img_present);
		
		
		
		
		logger.createNode("Image is not present");
		Assert.assertFalse(img_present);
		
		
	}
	
}
