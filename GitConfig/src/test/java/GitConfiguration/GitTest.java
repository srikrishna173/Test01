package GitConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchURL() {
		
		//String Chromepath = Thread.currentThread().getContextClassLoader().getResource("chromedriver.exe").getPath();
		//System.setProperty("webdriver.chrome.driver", "/GitRepo/GitConfig/src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",Thread.currentThread().getContextClassLoader().getResource("chromedriver.exe").getFile());
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/");
	}

	@Test
	public void gitTest() {
		System.out.println("Test Git");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
