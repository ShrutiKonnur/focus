package RestAssured.Focus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	WebDriver driver;
	@BeforeClass
	public void selectBrowsers()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.focuscapitalgroups.com");
		driver.manage().window().maximize();
	}
@AfterClass

	public void tearDown() {
		driver.quit();
	}
}



