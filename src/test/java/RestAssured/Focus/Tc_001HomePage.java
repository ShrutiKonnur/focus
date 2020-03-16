package RestAssured.Focus;

import org.testng.annotations.Test;

public class Tc_001HomePage extends  BaseClass {

	@Test
	public void LoginTest() throws InterruptedException{
	
	HomePage hp=new HomePage(driver);
	hp.clickonfirstname();
	hp.clickonphone();
	hp.clickonemail();
	hp.clickonmessage();
	
	}

}

