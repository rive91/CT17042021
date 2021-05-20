package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Inicialisamo los Page Object con PageFactory
										//This es un keword con el que le estamos diciendo que es la misma clase donde vamos a 
										//incicilaizar los webElements
	}
	
	//Login PageObjects/WebElements
	@FindBy (id="txtUsername")
	private WebElement userNameTxt;
	@FindBy(id="txtPassword")
	private WebElement passwordTxt;
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	
	public void login(String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	
	
}
