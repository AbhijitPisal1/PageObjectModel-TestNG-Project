package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopCartPage {

	@FindAll(value = @FindBy(css = "div.cart_item"))
	List<WebElement> items;
	

	@FindBy(id = "checkout")
	WebElement chkOutBtn;

	@FindBy(id = "continue-shopping")
	WebElement contBtn;

	@FindBy(id = "remove-sauce-labs-bolt-t-shirt")
	WebElement removeBtn;

	public ShopCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isItemAdded() {
		if(items.size() > 0) 
			return true;
		else 
			return false;
	}
		
	public void checkOutItems() {
		chkOutBtn.click();
	}

	public void removeItems() {
		removeBtn.click();
	}
	
	public void continueShop() {
		contBtn.click();
	}

}
