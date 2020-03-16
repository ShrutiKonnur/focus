package RestAssured.Focus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResidentialProgram {
	WebDriver driver;
//residebtial page
	@FindBy(xpath="//span[contains(text(),'RESIDENTIAL LOAN PROGRAMS')]")
	private WebElement residential;
	public void clickonresidential()
	{
		residential.click();
	}
	public  ResidentialProgram(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}


