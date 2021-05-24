package searchTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.CommonMethods;
import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;

public class TC_02 {
	WebDriver driver = DriverSetup.setupDriver();

	// Page Object
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_02_Search_Nathan() {
		//Login
		login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
		
		dashboard.clickMenuDirectory();
		
		directory.searchByName("Nathan");
		
		directory.selectJobTitle("Sales Representative");
		
		directory.selectLocation("1");
		
		directory.clickSearchBtn();
		
		boolean isUserDisplayed = directory.verifySearchName("Nathan");
		
		Assert.assertTrue(isUserDisplayed);
		
	}
	
	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshot(driver, "TC_02_Search_Nathan");
		driver.quit();
	}
}
