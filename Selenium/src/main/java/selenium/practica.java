package selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practica {

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
		Thread.sleep(3000);
		password.sendKeys("admin123");
		Thread.sleep(3000);
		loginBtn.click();
		Thread.sleep(3000);
		
		//Metodos del explorador
		String title = driver.getTitle();//Obtener titulo de la pagina
		System.out.println("El titulo es: " + title);
		
		//Obtener la URL
		String urlDashboard = driver.getCurrentUrl();
		System.out.println("La Url Actual es: " + urlDashboard);
		
		//Verificar elementos desplegados
		boolean assigLeasIsDisplayed = driver.findElement(By.className("quickLinkText")).isDisplayed();//Ejemplo webElement con classname
		
		if(assigLeasIsDisplayed) {
			System.out.println("La opcion Assign Leave esta desplegada");
		}
		
		//Obtener el text
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		
//		if(welcomeMsj.contains("Paul")) {//Contains es un metodo de java que verifica si un String contiene otro String
//			System.out.println("El mensaje tiene el nombre de paul");
//		}else {
//			System.out.println("ERROR el mensaje no es correcto");
//		}
				
		//Cerrando Navegador Web
		//driver.close();//Cierra la ventana actual que el driver esta utilizando
		//driver.quit();//Cerrar todas las ventana del webdriver
	}

}
