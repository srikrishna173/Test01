package GitConfiguration;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchURL() {
		
		//String Chromepath = Thread.currentThread().getContextClassLoader().getResource("chromedriver.exe").getPath();
		//System.setProperty("webdriver.chrome.driver", "/GitRepo/GitConfig/src/test/resources/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", classloader("chromedriver.exe"));
		
		
		System.setProperty("webdriver.ie.driver", classloader("IEDriverServer.exe"));
		//‪C:\Users\srikrishna.jena\Downloads\Firefox Setup Stub 53.0.3.exe
		//driver = new ChromeDriver();
		driver = new InternetExplorerDriver();
		
//		File pathBinary = new File("C:/Users/srikrishna.jena/Downloads/Firefox Setup Stub 53.0.3.exe");
//		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
//		FirefoxProfile firefoxProfile = new FirefoxProfile();       
//		WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
		
//		
//		File pathToBinary = new File("C:/Users/srikrishna.jena/Downloads/Firefox Setup Stub 53.0.3.exe");
//		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//		FirefoxProfile firefoxProfile = new FirefoxProfile();
//		System.setProperty("webdriver.gecko.driver","C:/Users/srikrishna.jena/Downloads/geckodriver.exe");       
//		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		driver.get("http://www.guru99.com/");
		driver.manage().window().maximize();
	}
	
	public String classloader(String element) {
		String path = ClassLoader.getSystemResource(element).getFile().replaceAll("%20", " ");
		return path;
		
	}
		

	@Test
	public void gitTest() {
		System.out.println("Test Git");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ALT, "f").sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Done");
	}
	
	@AfterMethod
	public void closeBrowser() {

	}
}
