package driverSetup;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	
	public static WebDriver setupDriver() {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //Setear el la ruta de nuestro chromredriver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); //inicializando nuestro chrome driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static WebDriver setupDriver(String browser) {
		WebDriver driver = null;
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //Setear el la ruta donde se guardan los drivers
		
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", exePath + "geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		default:
			return null;
		}

	}
}
