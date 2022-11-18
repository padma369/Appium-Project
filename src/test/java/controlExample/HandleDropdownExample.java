package controlExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownExample extends BaseTest{
	
	
	//@Test
	public void dropdown_mul_test() throws Exception {
		
		
		
		WebElement list = driver.findElement(By.cssSelector("select[name='FromLB']"));
		
		
		Select sel = new Select(list);
		
		System.out.println("is multiple selectionare enabled or not: " + sel.isMultiple());
		Assert.assertTrue(sel.isMultiple());
		
		Thread.sleep(2000);
		sel.selectByIndex(0);				//USA
		Thread.sleep(2000);
		sel.selectByIndex(1);				//Russia
		Thread.sleep(2000);
		sel.selectByValue("India");			//India
		Thread.sleep(2000);
		sel.selectByVisibleText("Germany");	//Germany
		
		Thread.sleep(4000);
		sel.deselectAll();
		
		
		sel.selectByValue("India");	
		sel.selectByVisibleText("Germany");
		sel.selectByIndex(0);
		
		Thread.sleep(4000);
		
		sel.deselectByVisibleText("Germany");
		sel.deselectByIndex(0);
		
	}
	
	
	@Test
	public void dropdown_single_test() throws Exception {
		
		
		
		WebElement list = driver.findElement(By.tagName("select"));     //by default it will perform action on first element
		
		
		Select sel = new Select(list);
		
		System.out.println("is multiple selectionare enabled or not: " + sel.isMultiple());
		Assert.assertFalse(sel.isMultiple());   //false
		
		Thread.sleep(2000);
		sel.selectByIndex(1);				//Saab
		
		Thread.sleep(2000);
		sel.selectByValue("Singapore");		//Opel
		
		Thread.sleep(2000);
		sel.selectByVisibleText("Toyota");	//Toyota
		
		
		
	}

}
