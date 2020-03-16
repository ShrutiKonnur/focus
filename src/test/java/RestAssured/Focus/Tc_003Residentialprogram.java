package RestAssured.Focus;

import org.testng.annotations.Test;

public class Tc_003Residentialprogram extends BaseClass {
	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("http://www.focuscapitalgroups.com");
		driver.manage().window().maximize();
		ResidentialProgram rp = new ResidentialProgram(driver);
		rp.clickonresidential();

	}
}
