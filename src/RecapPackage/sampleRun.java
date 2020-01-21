package RecapPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleRun{
	
	public WebDriver driver ;
	

@BeforeTest
	public void preconditions() {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\IB Tech\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	System.out.println();
	System.out.println("All preconditions code goes here...");
}
	
@Test

	public void sampleMethod() {

	driver.get("https://www.google.com/?gws_rd=ssl");
	System.out.println();
	System.out.println("Main test code goes here : ");

	}


@AfterTest

 public void tearDown() {

	System.out.println();
	System.out.println("Teardown code goes here...");
	System.out.println();
	driver.close();

	}
	
}