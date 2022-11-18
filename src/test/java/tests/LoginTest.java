package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void TC_01_verifyLoginFeatureWithValid() {

		lp.enterEmail(conf.getAdminUser());
		lp.enterPass(conf.getAdminPass());
		lp.clickCheckBox();
		lp.clickLoginButton();
//		//validation Steps

	}

	@Test(priority = 2)
	public void verifyAppLicationTitle() {

		lp.verifyAppTitle("Dashboard / nopCommerce administration");
	}

	@Test(priority = 3)
	public void verifyLogout() {

		lp.clickLogout();
	}

}
