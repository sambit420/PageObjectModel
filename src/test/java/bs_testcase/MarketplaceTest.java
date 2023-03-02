package bs_testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bs_baseclasses.TestBase;
import bs_pages.HomePage;
import bs_pages.LoginPage;
import bs_pages.Marketplace;

public class MarketplaceTest extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	Marketplace marketplace;
	public MarketplaceTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		marketplace=new Marketplace();
		loginPage = new LoginPage();
		homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	  @Test(priority = 1)	
	public void marketPlaceBtn() throws InterruptedException {
		Thread.sleep(2000);
		marketplace.marketpacebtn();
		
	}
	  @Test(priority = 2)
	
	@AfterMethod
	public void tearDown() {
//	driver.quit();

	}
}
