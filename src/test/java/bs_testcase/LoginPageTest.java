package  bs_testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import bs_baseclasses.TestBase;
import bs_pages.HomePage;
import bs_pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void loginTest() {

		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority = 2)
	 public void facebooklogo() {
		boolean flag =loginPage.validFacebookLogo();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void tearDown() {
	//driver.quit();

	}

	
}



