package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ArticleEditPage;
import pages.ArticleInfoPage;
import pages.ArticleLoginPage;
import pages.ArticleHomePage;

public class ArticleTest {
	WebDriver driver;
	ArticleLoginPage loginPage;
	ArticleHomePage homepage;
	ArticleEditPage editPage;
	ArticleInfoPage infoPage;

	public ArticleTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new ArticleLoginPage(driver);
		homepage = new ArticleHomePage(driver);
		editPage = new ArticleEditPage(driver);
		infoPage = new ArticleInfoPage(driver);
	}
	
	@BeforeTest
	public void setup() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
	}

	@Test
	public void validLoginTest() {
		loginPage.loginIntoApp("AutoTester@test.com", "Test@test111");
	}

	@Test(priority = 1)
	public void CreateNewArticle() {
		homepage.createNewArticle();
		editPage.EnterNewDetailsInArticleForm("first article Autotester921", "This is desc of article", "This is the content of article", "Art#1");
		editPage.SubmitInfo();
		Assert.assertTrue(infoPage.checkArticleContentIsCorrect("This is the content of article"));
	}

	@Test(priority = 2)
	public void UpdateArticle() {
		infoPage.EditArticle();
		editPage.EnterNewDetailsInArticleForm("updated the article Autotester2627", "This is the updated desc of article", "new content of article", "Art#1");
		editPage.SubmitInfo();
		Assert.assertTrue(infoPage.checkArticleContentIsCorrect("new content of article"));
	}
	
	@Test(priority = 3)
	public void delArticle() {
		infoPage.deleteArticle();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals(alert.getText(), "Want to delete the article?"); 
		alert.accept();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
