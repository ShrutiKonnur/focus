package RestAssured.Focus;

import org.testng.annotations.Test;

public class Tc_005Contactus extends BaseClass {
	@Test
	public void LoginTest() throws InterruptedException {
		// driver.get("http://www.focuscapitalgroups.com");
		// driver.manage().window().maximize();
		ContactUsPage cp = new ContactUsPage(driver);
		cp.clickoncontactus();

	}
}
