package appiumMobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TC_01_VirtualDevice_CalcualtorApp_Native_Indentification {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		
		//DeviceInfo
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("udid", "emulator-5554");                                           //adb devices      //Key: value
		//cap.setCapability("platformVersion", "10.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		cap.setCapability("platformName", "Android"); 
		
		
		
		//App info
		//AppPackage
		//AppActivity
		//APK info application
		
		//adb shell dumpsys window | find "mCurrentFocus"
		// mCurrentFocus=Window{d2cd1bc u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		cap.setCapability("appPackage", "com.google.android.calculator"); 
		cap.setCapability("appActivity", "com.android.calculator2.Calculator"); 
		
		
		
		//Appium Server
		
		//String appiumServer = "http://192.168.1.5:4723/wd/hub";
		String appiumServer = "http://localhost:4723/wd/hub";
		//WebDriver driver = new ChromeDriver();
		
		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), cap);
		
	}
	
	
	@Test
	public void verifyAppFeature() {

		//98
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		
		
		//iOS -----AccessibilityId ----- content-desc in Android
		//
		
		//+
		//driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		//driver.findElementByAccessibilityId("plus").click();
		driver.findElementByAccessibilityId("plus").click();
		
		
		//989
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		driver.findElement(By.id("digit_9")).click();
		
		//equal =
		driver.findElement(By.id("eq")).click();
		
		
		//result
		String actualResult = driver.findElement(By.id("result_final")).getText();
		System.out.println("Result: " + actualResult);
		
		
		Assert.assertEquals(actualResult, "1087");
		System.out.println("Validation of add feature test.");
		
		
	}

}
