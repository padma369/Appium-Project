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

public class TC_01_RealDevice_InsatllAPP_COntentDesc_XPATH2 {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws Exception {

		// DeviceInfo

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("udid", "c60c1a73"); // adb devices //Key: value
		// cap.setCapability("platformVersion", "10.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "IBMGameMachine");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);

		// App info
		// AppPackage
		// AppActivity
		// APK info application

		// adb shell dumpsys window | find "mCurrentFocus"
		// mCurrentFocus=Window{d2cd1bc u0
		// com.google.android.calculator/com.android.calculator2.Calculator}

		// adb shell dumpsys window | find "mCurrentFocus"
		// mCurrentFocus=Window{88c585b u0
		// com.google.android.calculator/com.android.calculator2.Calculator}

//		cap.setCapability("appPackage", "com.google.android.calculator"); 
//		cap.setCapability("appActivity", "com.android.calculator2.Calculator"); 

		cap.setCapability(MobileCapabilityType.APP, "d:\\Jar_files\\ApiDemos-debug.apk");
		// appPackage and appActivity

		// Appium Server

		// String appiumServer = "http://192.168.1.5:4723/wd/hub";
		String appiumServer = "http://localhost:4723/wd/hub";
		// WebDriver driver = new ChromeDriver();

		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), cap);

	}

	@Test
	public void verifyAppFeature() {

		MobileElement ele_OS = driver.findElementByAccessibilityId("OS");

		System.out.println("Text: " + ele_OS.getText());

		ele_OS.click();

		//MobileElement ele_SMS = driver.findElement(By.xpath("//*[contains(@content-desc,'SMS')]"));
		MobileElement ele_SMS = driver.findElement(By.xpath("//android.widget.TextView[contains(@content-desc,'SMS')]"));

		System.out.println("Text: " + ele_SMS.getText());

		ele_SMS.click();

		System.out.println("Validation of add feature test.");

	}

}
