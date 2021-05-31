package logintTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.CommonMethods;
import driverSetup.DriverSetup;
import globalVariables.GlobalVariables;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;

public class TC_01 {
	WebDriver driver = DriverSetup.setupDriver("firefox");

	// Page Object
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	
	//Get JSON Data
//	String user = CommonMethods.getJSONvalue("TC_01", "username");
//	String password = CommonMethods.getJSONvalue("TC_01", "password2");
	
	//Get Excel Data
	String userE = CommonMethods.getCellData("TC_01", 1, 0);
	String passwordE = CommonMethods.getCellData("TC_01", 1, 1);

	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01_CorrectLogin() throws InterruptedException {
		login.login(userE, passwordE);		
		dashboard.logout();

	}

	@AfterTest
	public void closeDriver() {
		CommonMethods.takeScreenshot(driver, "TC_01_CorrectLogin");
		driver.quit();
	}
}
