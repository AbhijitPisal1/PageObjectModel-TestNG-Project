package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopLoginPage {
	
	@FindBy(id="user-name")
	WebElement userId;

	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	//constructor to initialize
	public ShopLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Action
	public void loginIntoApp(String strUser, String strpwd) {
		userId.sendKeys(strUser);
		pwd.sendKeys(strpwd);
		loginbtn.click();
	}
}
