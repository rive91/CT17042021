package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //Setear el la ruta de nuestro chromredriver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); //inicializando nuestro chrome driver
		driver.get("https://my-testing.getclue.com/");
		
//		WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder=\"Enter your phone number (required)\"]"));
//		phoneNumber.sendKeys("(456) 782 3435");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/form/div/div[1]/div/img"));
		country.click();
		
		Thread.sleep(2000);
		WebElement argentina = driver.findElement(By.xpath("//*[contains(text(),'Argentina')]"));
		argentina.click();


		//Agregando linea de codigo
		//Linea 2
		//linea 3
	}

}
