package testScripts;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import commonUtils.ConfigLoader;
import pages.ArticleEditPage;
import pages.ArticleInfoPage;
import pages.ArticleLoginPage;
import pages.ArticleHomePage;

import java.util.Properties;

public class ArticleTest_DataRepo {
	WebDriver driver;
	ArticleLoginPage loginPage;
	ArticleHomePage homepage;
	ArticleEditPage editPage;
	ArticleInfoPage infoPage;
	Properties prop;
	ConfigLoader config;

	public ArticleTest_DataRepo() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new ArticleLoginPage(driver);
		homepage = new ArticleHomePage(driver);
		editPage = new ArticleEditPage(driver);
		infoPage = new ArticleInfoPage(driver);
	}

	
	@BeforeMethod
	public void GetVariables() throws IOException {
			prop = new Properties();
			String path = System.getProperty("user.dir") + "//src//test//resources//configFiles//config.properties";
			FileInputStream fileIn = new FileInputStream(path);
			prop.load(fileIn);
		}

	
	@Test(priority = 1)
	public void setup() {
		String strURL= prop.getProperty("baseUrl");
		String strUser= prop.getProperty("username");
		String strPass= prop.getProperty("password");
		TestBase.openUrl(strURL);
		loginPage.loginIntoApp(strUser,strPass);	
	}

	
	@Test(priority = 2)
	public void CreateNewArticle() {
		homepage.createNewArticle();
		String strtitle= prop.getProperty("title1");
		String strdesc= prop.getProperty("desc1");
		String strContent= prop.getProperty("content1");
		String strTag= prop.getProperty("tag1");
		
		editPage.EnterNewDetailsInArticleForm(strtitle, strdesc,
				strContent, strTag);
		editPage.SubmitInfo();
		Assert.assertTrue(infoPage.checkArticleContentIsCorrect(strContent));
	}

	
	@Test(priority = 3)
	public void UpdateArticle() {
		String strtitle= prop.getProperty("title2");
		String strdesc= prop.getProperty("desc2");
		String strContent= prop.getProperty("content2");
		String strTag= prop.getProperty("tag1");
		
		infoPage.EditArticle();
		editPage.EnterNewDetailsInArticleForm(strtitle, strdesc,
				strContent, strTag);
		editPage.SubmitInfo();
		Assert.assertTrue(infoPage.checkArticleContentIsCorrect(strContent));
	}

	
	@Test(priority = 4)
	public void delArticle() {
		infoPage.deleteArticle();
	}

	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
}
