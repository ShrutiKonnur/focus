package RestAssured.Focus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;
//contact us page
	@FindBy(xpath = "(//pan[@class='avia-menu-text'])[4]")
	private WebElement contactus;

	public void clickoncontactus() {
		contactus.click();
	}

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
