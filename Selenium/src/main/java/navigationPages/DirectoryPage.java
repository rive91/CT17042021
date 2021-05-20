package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {
	
	public DirectoryPage (WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}
	
	//WebElements
	@FindBy(id = "searchDirectory_emp_name_empName")
	private WebElement searchTxt;
	@FindBy(id = "searchDirectory_job_title")
	private WebElement drpDwnJobtitle;
	@FindBy(id = "searchDirectory_location")
	private WebElement drpDwnLocation;
	@FindBy(id = "searchBtn")
	private WebElement searchBtn;
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement searchResult;
	
	public void searchByName(String name) {
		searchTxt.sendKeys(name);
	}
	
	public void selectJobTitle(String job) {
		Select oSelect = new Select(drpDwnJobtitle);
		oSelect.selectByVisibleText(job);
	}
	
	public void selectLocation(String location) {
		Select oSelect = new Select(drpDwnLocation);
		oSelect.selectByValue(location);
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public boolean verifySearchName(String expectedName) {
		System.out.println("User on the list is: " + searchResult.getText());
		return searchResult.getText().contains(expectedName);
	}

}
