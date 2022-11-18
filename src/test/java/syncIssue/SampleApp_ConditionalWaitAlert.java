package syncIssue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleApp_ConditionalWaitAlert {

	@Test
	public void verifyLoginLogoutTest() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait -------- any elememt

		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicit Wait
		// wait for specific condition

		customDelay(driver, 20);

		// handle alert
		Alert al = driver.switchTo().alert();

		System.out.println(al.getText());
		al.accept();

		driver.close();

	}

	public void customDelay(WebDriver driver, int timedelay) {

		WebDriverWait wait = new WebDriverWait(driver, timedelay); // max time
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public void customDelayForElement(WebDriver driver, WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, 10); // max time
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

}
