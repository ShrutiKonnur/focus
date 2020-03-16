package RestAssured.Focus;

import org.testng.annotations.Test;

public class Tc_002AboutUs extends BaseClass {
	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("http://www.focuscapitalgroups.com");
		driver.manage().window().maximize();
		AboutUs ap = new AboutUs(driver);
		ap.clickonaboutus();

	}
}