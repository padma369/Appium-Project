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

public class TC_01_VirtualDevice_CalcualtorApp_Native2 {
	
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
		 // mCurrentFocus=Window{49355a4 u0 com.google.android.deskclock/com.android.deskclock.DeskClock}
		
		cap.setCapability("appPackage", "com.google.android.deskclock"); 
		cap.setCapability("appActivity", "com.android.deskclock.DeskClock"); 
		
		
		
		//Appium Server
		
		//String appiumServer = "http://192.168.1.5:4723/wd/hub";
		String appiumServer = "http://localhost:4723/wd/hub";
		//WebDriver driver = new ChromeDriver();
		
		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), cap);
		
	}
	
	
	@Test
	public void verifyAppFeature() {

		//98
		String dateTime = driver.findElement(By.id("com.google.android.deskclock:id/date")).getText();
		System.out.println("Date and Time: " + dateTime);
		System.out.println("Validation of add feature test.");
		
		
	}

}
