package RestAssured.Focus;

import org.testng.annotations.Test;

public class Tc_006ApllyNowpage extends BaseClass {
	@Test
	public void LoginTest() throws InterruptedException {
		AppllyNowpage ap = new AppllyNowpage(driver);
		ap.clickonapplynow();
		ap.clickonrefiance();
		ap.clickonsingle();
		ap.clickonprimary();
		ap.clickoncbox();
		ap.clickonhvalue();
		ap.clickonnext();
		ap.clickonmvalue();
		ap.clickonnext2();
		ap.clickoncashvalue();
		ap.clickonnext3();
		ap.clickonhowold();
		ap.clickonnext4();
		ap.clickonservice();
		ap.clickonprofile();
		ap.clickonsecondmvalue();
		ap.clickonnvalue();
		ap.clickonpastyear();
		ap.clickonpastyear2();
		ap.clickonfname();
		ap.clickonlname();
		ap.clickonnbutton();
		ap.clickonpnum();
		ap.clickonnbutton2();
		ap.clickoncaddress();
		ap.clickonnbutton4();
		ap.clickoncurrentmaail();
		ap.clickonzipcode();
		ap.clickonsumbit();

	}
}
