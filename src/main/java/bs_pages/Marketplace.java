package bs_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bs_baseclasses.TestBase;

public class Marketplace extends TestBase{
	@FindBy(xpath="//a[@aria-label='Marketplace']//span[@class='x1n2onr6']//*[name()='svg']")
	WebElement Marketplacebotton;
	@FindBy(xpath ="//input[@aria-controls='jsc_c_tc']")
	WebElement SerchMarketplace;
	@FindBy(xpath="//a[@class='x1i10hfl x1qjc9v5 xjqpnuy xa49m3k xqeqjp1 x2hbi6w x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x1ypdohk xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x16tdsg8 x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1q0g3np x87ps6o x1lku1pv x1a2a7pz x1lq5wgf xgqcy7u x30kzoy x9jhf4c x1lliihq xljulmy']//div//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x676frb x1lkfr7t x1lbecb7 xk50ysn xzsf02u x1yc453h']")
	WebElement Browseall;
	// initializing page object
		public Marketplace () {
			PageFactory.initElements(driver, this);
		}
		// actions
		public void serchFacebookmarketplace(String searching) {
			SerchMarketplace.sendKeys(searching,Keys.ENTER);
		}
		public void marketpacebtn() {
			Marketplacebotton.click();
		}
		public void browseall() {
			Browseall.click();
			
		}

}



