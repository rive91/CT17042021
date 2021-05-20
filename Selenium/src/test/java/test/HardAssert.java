package test;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {
  @Test
  public void assertEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(a, b);
  }
  
  @Test
  public void asserNotEquals(){
	  int a = 5;
	  int b = 10;
	  Assert.assertNotEquals(a, b);
  }
  
  @Test
  public void assertTrue() {
	  int a = 10;
	  int b = 10;
	  Assert.assertTrue(a==b);
  }
  
  @Test
  public void verificarTituloDePagina() {
	    String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //Setear el la ruta de nuestro chromredriver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); //inicializando nuestro chrome driver
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		boolean titulo = actualTitle.equals(expectedTitle);
		
		Assert.assertTrue(titulo);
  }
}
