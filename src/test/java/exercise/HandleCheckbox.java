package exercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseTest;
//import controlExample.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckbox extends BaseTest{

	

	@Test
	public void handleCheckbox() {

		System.out.println("handle checkbox...");

		driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@value='Boat']")).click();
	}

}
