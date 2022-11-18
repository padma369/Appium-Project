package controlExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class HandleAlertExample extends BaseTest{
	
	//@Test
	public void simpleAlert() throws Exception {
		
		
		
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		
		
		//SwitchTo ----- alert/window/frame
		//Alert
		
		//accept/dismiss/getText/sendkeys
		
		Alert simple_Alert = driver.switchTo().alert();
		
		Thread.sleep(4000);
		
		//validation
		String actualAlertText = simple_Alert.getText();
		System.out.println(actualAlertText);
		Assert.assertEquals("Hi.. This is alert message!", actualAlertText);
		Assert.assertTrue(actualAlertText.contains("alert message"));
		
		//simple_Alert.accept();			//click on Ok button
		simple_Alert.dismiss();				//click on cancel button ----- esc key
		
		
		
		
	}
	
	
	@Test
	public void confirmAlert() throws Exception {
		
		
		
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();
		
		
		//SwitchTo ----- alert/window/frame
		//Alert
		
		//accept/dismiss/getText/sendkeys
		
		Alert confirmAlert = driver.switchTo().alert();
		
		Thread.sleep(4000);
		
		//validation
		String actualAlertText = confirmAlert.getText();
		System.out.println(actualAlertText);
		Assert.assertEquals("Press 'OK' or 'Cancel' button!", actualAlertText);
		Assert.assertTrue(actualAlertText.contains("'OK' or 'Cancel'"));
		
		//simple_Alert.accept();			//click on Ok button
		confirmAlert.dismiss();				//click on cancel button ----- esc key
		
		
		
		//validation step
		String cancelLabel = driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println(cancelLabel);
		Assert.assertTrue(cancelLabel.contains("Cancel"));
		
		
	}

}
