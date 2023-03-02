package bs_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bs_baseclasses.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//input[contains(@class,'x1i10hfl')][1]")
	WebElement serch;
	//@FindBy(xpath = "//a[@aria-label='Home']//span[@class='x1n2onr6']//*[name()='svg']")
	@FindBy(xpath = "//body/div[@id='mount_0_0_Os']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]")
	WebElement home;
     @FindBy(xpath="//span[contains(text(),'Sambit Kumar Behera')]")
 	WebElement profile ;
	// initializing page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// actions
	public void serchFacebook(String serching) {
		serch.sendKeys(serching,Keys.ENTER);
	}
	
	public void homebutton() {
		home.click();
}
	public void profilelink() {
		profile.click();
}}
