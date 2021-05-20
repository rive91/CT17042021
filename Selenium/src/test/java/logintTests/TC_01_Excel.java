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

public class TC_01_Excel {
	WebDriver driver = DriverSetup.setupDriver();

	// Page Object
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	
	//Get excel Data
	String user = CommonMethods.getCellData("TC01", 1, 0);
	String password = CommonMethods.getCellData("TC01", 1, 1);


	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01_CorrectLogin() throws InterruptedException {
		login.login(user, password);
		
		dashboard.logout();
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
