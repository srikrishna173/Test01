package GitConfiguration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitTest {
	
	RemoteWebDriver driver;
	
	@BeforeMethod
	public void launchURL() {
		
		//String Chromepath = Thread.currentThread().getContextClassLoader().getResource("chromedriver.exe").getPath();
		//System.setProperty("webdriver.chrome.driver", "/GitRepo/GitConfig/src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",ClassLoader.getSystemResource("chromedriver.exe").getFile().replaceAll("%20", " "));
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
