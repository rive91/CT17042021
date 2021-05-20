package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage (WebDriver driver){
		PageFactory.initElements(driver, this);//Inicialisamo los Page Object con PageFactory
		//This es un keword con el que le estamos diciendo que es la misma clase donde vamos a 
		//incicilaizar los webElements
	}
	
	//Dashboard Object
	@FindBy(id = "welcome")
	private WebElement welcomeDrpDwn;
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement logoutBtn;
	@FindBy(id = "menu_directory_viewDirectory")
	private WebElement menuDirectory;
	
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		welcomeDrpDwn.click();
		Thread.sleep(3000);
		logoutBtn.click();
		
		Thread.sleep(3000);
	}
	
	public void clickMenuDirectory() {
		menuDirectory.click();
	}

}
