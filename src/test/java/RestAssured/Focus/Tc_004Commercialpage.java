package RestAssured.Focus;

import org.testng.annotations.Test;

public class Tc_004Commercialpage extends BaseClass {
	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("http://www.focuscapitalgroups.com");
		driver.manage().window().maximize();
		CommercialPage cp = new CommercialPage(driver);
		cp.clickoncpage();

	}
}
