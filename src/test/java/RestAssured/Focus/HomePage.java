package RestAssured.Focus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	// Firstname
	@FindBy(xpath = "//input[@id='input_8_1']")
	private WebElement firstname;

	public void clickonfirstname() {
		firstname.sendKeys("shruti");
	}

	// phone
	@FindBy(xpath = "//input[@id='input_8_2']")
	private WebElement phone;

	public void clickonphone() {
		phone.sendKeys("9880441954");
	}

	// email
	@FindBy(xpath = "//input[@id='input_8_3']")
	private WebElement email;

	public void clickonemail() {
		email.sendKeys("shrutikonnur@gmail.com");
	}

	// msg
	@FindBy(xpath = "//textarea[@id='input_8_4']")
	private WebElement message;

	public void clickonmessage() {
		message.sendKeys("hi hello");
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
