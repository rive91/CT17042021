package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResolucionEjercicio {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //Setear el la ruta de nuestro chromredriver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver(); //inicializando nuestro chrome driver
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();//maximizar la ventana del navegador
		
		//Obteniendo objetos/webElement de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		
		//Login
		userName.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("admin123");
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(1000);
		
		WebElement menuDirectory = driver.findElement(By.id("menu_directory_viewDirectory"));
		menuDirectory.click();

		WebElement nameTxtBox = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		nameTxtBox.sendKeys("Nathan");
		
		WebElement searchBtn = driver.findElement(By.id("searchBtn"));
		searchBtn.click();
		
		String nameSearchResult = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();
		boolean nameEquals = nameSearchResult.contains("Nathan");
		
		Thread.sleep(3000);
		
		if(nameEquals) {
			System.out.println("El nombre esperado es correcto");
		} else {
			System.out.println("El nombre eserado es incorrecto");
		}

	}

}
