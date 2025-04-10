package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleHomePage {

	@FindBy(xpath = "//a[@href='#/editor']")
	WebElement newArt;
	
	@FindBy(linkText = "Home")
	WebElement homeIcon;
	
	@FindBy(linkText = "Global Feed")
	WebElement ListAll;

	// initialize constructor using pagefactory
	public ArticleHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// add items
	public void createNewArticle() {
		newArt.click();
	}
	
	public void NavigateHome() {
		homeIcon.click();
	}
	
	public void OpenArticle() {
		ListAll.click();
	}


}
