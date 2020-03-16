package RestAssured.Focus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppllyNowpage {
	WebDriver driver;

	// applynow page
	@FindBy(xpath = "//span[contains(text(), 'APPLY NOW ')]")
	private WebElement applynow;

	public void clickonapplynow() {
		applynow.click();
	}

	// home refiane
	@FindBy(xpath = "//div[contains(text(),'Home Refinance')]")
	private WebElement refiance;

	public void clickonrefiance() {
		refiance.click();
	}

	// single fmaily
	@FindBy(xpath = "//div[contains(text(),'Single Family')]")
	private WebElement single;

	public void clickonsingle() {
		single.click();
	}

	// primary
	@FindBy(xpath = "//div[contains(text(),'Primary Residence')]")
	private WebElement primary;

	public void clickonprimary() {
		primary.click();
	}

	// checkbox
	@FindBy(xpath = "//label[@id='label_3_9_0']")
	private WebElement cbox;

	public void clickoncbox() {
		cbox.click();
	}

	// estimated home value
	@FindBy(xpath = "//input[@id='input_3_16']")
	private WebElement hvalue;

	public void clickonhvalue() {
		hvalue.sendKeys("23");
	}

	// next button
	@FindBy(xpath = "//input[@id='gform_next_button_3_17']")
	private WebElement next;

	public void clickonnext() {
		next.click();
	}

	// mortage value
	@FindBy(xpath = "//input[@id='input_3_18']")
	private WebElement mvalue;

	public void clickonmvalue() {
		mvalue.sendKeys("75");
	}

	// next2 button
	@FindBy(xpath = "//input[@id='gform_next_button_3_20']")
	private WebElement next2;

	public void clickonnext2() {
		next2.click();
	}

	// cash value
	@FindBy(xpath = "//input[@id='input_3_19']")
	private WebElement cashvalue;

	public void clickoncashvalue() {
		cashvalue.sendKeys("67");
	}

	// next3 button
	@FindBy(xpath = "//input[@id='gform_next_button_3_21']")
	private WebElement next3;

	public void clickonnext3() {
		next3.click();
	}

	// 8th step
	@FindBy(xpath = "//input[@id='input_3_22']")
	private WebElement howold;

	public void clickonhowold() {
		howold.sendKeys("23");
	}

	// next4 button
	@FindBy(xpath = "//input[@id='gform_next_button_3_23']")
	private WebElement next4;

	public void clickonnext4() {
		next4.click();
	}

	// 9th step
	@FindBy(xpath = "(//div[contains(text(),'Yes')])[4]")
	private WebElement service;

	public void clickonservice() {
		service.click();
	}

	// 10th step
	@FindBy(xpath = "//div[contains(text(),'Excellent 720+')]")
	private WebElement profile;

	public void clickonprofile() {
		profile.click();
	}

	// 11th step
	@FindBy(xpath = "(//div[contains(text(),'Yes')])[6]")
	private WebElement secondmvalue;

	public void clickonsecondmvalue() {
		secondmvalue.click();
	}

	// 12th step
	@FindBy(xpath = "//label[@id='label_3_38_0']")
	private WebElement nvalue;

	public void clickonnvalue() {
		nvalue.click();
	}

	// 13th step
	@FindBy(xpath = "(//div[contains(text(),'Yes')])[9]")
	private WebElement pastyear;

	public void clickonpastyear() {
		pastyear.click();
	}

	// 14th step
	@FindBy(xpath = "(//div[contains(text(),'Yes')])[12]")
	private WebElement pastyear2;

	public void clickonpastyear2() {
		pastyear2.click();
	}

	// 15th step
	@FindBy(xpath = "//input[@id='input_3_48']")
	private WebElement fname;

	public void clickonfname() {
		fname.sendKeys("shruti");
	}

	// 15th step
	@FindBy(xpath = "//input[@id='input_3_49']")
	private WebElement lname;

	public void clickonlname() {
		lname.sendKeys("konnur");
	}

	// 15th step
	@FindBy(xpath = "//input[@id='gform_next_button_3_39']")
	private WebElement nbutton;

	public void clickonnbutton() {
		nbutton.click();
	}

	// 16th step
	@FindBy(xpath = "//input[@id='input_3_94']")
	private WebElement pnum;

	public void clickonpnum() {
		pnum.sendKeys("9880441954");
	}

	// 16th step
	@FindBy(xpath = "//input[@id='gform_next_button_3_41']")
	private WebElement nbutton2;

	public void clickonnbutton2() {
		nbutton2.click();
	}

	// 17th step
	@FindBy(xpath = "//input[@id='input_3_43']")
	private WebElement eaddress;

	public void clickoneaddress() {
		eaddress.sendKeys("shrutikonnur@gmail.com");
	}

	// 17th step
	@FindBy(xpath = "//input[@id='gform_next_button_3_42']")
	private WebElement nbutton3;

	public void clickonnbutton3() {
		nbutton3.click();
	}

	// 18th step
	@FindBy(xpath = "//input[@id='input_3_43']")
	private WebElement caddress;

	public void clickoncaddress() {
		caddress.sendKeys("shrutikonnur@gmail.com");
	}

	// 18th step
	@FindBy(xpath = "//input[@id='gform_next_button_3_42']")
	private WebElement nbutton4;

	public void clickonnbutton4() {
		nbutton4.click();
	}

	// 18th step
	@FindBy(xpath = "//input[@id='input_3_50']")
	private WebElement currentmaail;

	public void clickoncurrentmaail() {
		currentmaail.sendKeys("shrutikonnur@gmail.com");
	}

	// 18th step
	@FindBy(xpath = "//input[@id='input_3_51']")
	private WebElement zipcode;

	public void clickonzipcode() {
		zipcode.sendKeys("45618");
	}

	// 18th step
	@FindBy(xpath = "//input[@id='gform_submit_button_3']")
	private WebElement sumbit;

	public void clickonsumbit() {
		sumbit.click();
	}

	public AppllyNowpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
