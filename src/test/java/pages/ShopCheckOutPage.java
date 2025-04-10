package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopCheckOutPage {

	@FindBy(id = "first-name")
	WebElement FirstName;
	
	@FindBy(id = "last-name")
	WebElement lastName;
	
	@FindBy(id = "postal-code")
	WebElement zipCode;
	
	@FindBy(id = "cancel")
	WebElement CancelBtn;
	
	@FindBy(id = "continue")
	WebElement Cont1Btn;
	
	@FindBy(id = "finish")
	WebElement finishBtn;
	
	@FindBy(className = "complete-header")
	WebElement ConfirmMsg;
	
	public ShopCheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Action
		public void ProvideUserDetails(String first, String last, String num) {
			FirstName.sendKeys(first);
			lastName.sendKeys(last);
			zipCode.sendKeys(num);
		}

		public void contiueCheckOut() {
			Cont1Btn.click();
		}

		public void finishOrder() {
			finishBtn.click();
		}
		
		public boolean isOrderSuccess() {
			if (ConfirmMsg.isDisplayed())
				return true;
			else
				return false;
		}
}

