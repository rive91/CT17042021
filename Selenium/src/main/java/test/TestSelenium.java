package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //Setear el la ruta de nuestro chromredriver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); //inicializando nuestro chrome driver
		driver.get("https://www.google.com");
		//Agregando linea de codigo
		
	}

}
