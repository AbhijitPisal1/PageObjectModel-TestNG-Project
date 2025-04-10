package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopProductListPage {

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement ItemOne;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement ItemTwo;
	
//	@FindBy(css = "div.inventory_item_label > a > div")
//	
	
	@FindBy(className = "shopping_cart_link")
	WebElement CartBtn;

	// initialize constructor using pagefactory
	public ShopProductListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// add items
	public void addItemsToCart() {
		ItemOne.click();
		ItemTwo.click();
	}

	public void viewCart() {
		CartBtn.click();
	}

}
