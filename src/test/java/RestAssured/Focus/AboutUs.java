package RestAssured.Focus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	WebDriver driver;
//aboutus
	@FindBy(xpath = "//span[contains(text(),'ABOUT US')]")
	private WebElement aboutus;

	public void clickonaboutus() {
		aboutus.click();
	}

	public AboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
