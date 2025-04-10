package testScripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ShopCartPage;
import pages.ShopCheckOutPage;
import pages.ShopLoginPage;
import pages.ShopProductListPage;

public class ShopAppTest {
	WebDriver driver;
	ShopLoginPage loginPage;
	ShopProductListPage listpage;
	ShopCartPage cartpage;
	ShopCheckOutPage chkoutPage;

	public ShopAppTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new ShopLoginPage(driver);
		listpage = new ShopProductListPage(driver);
		cartpage = new ShopCartPage(driver);
		chkoutPage = new ShopCheckOutPage(driver);
	}

	@BeforeTest
	public void setup() {
		TestBase.openUrl("https://www.saucedemo.com/");
	}

	@Test
	public void validLoginTest() {
		loginPage.loginIntoApp("standard_user", "secret_sauce");
	}

	@Test(priority = 1)
	public void addItems() {
		listpage.addItemsToCart();
		listpage.viewCart();
		Assert.assertTrue(cartpage.isItemAdded());
	}

	@Test(priority = 2)
	public void checkOutItem(){
	cartpage.checkOutItems();
	chkoutPage.ProvideUserDetails("Matt", "Henry", "1234533");
	chkoutPage.contiueCheckOut();
//	Assert.assertTrue(cartpage.isItemAdded());
	chkoutPage.finishOrder();
	Assert.assertTrue(chkoutPage.isOrderSuccess());
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
