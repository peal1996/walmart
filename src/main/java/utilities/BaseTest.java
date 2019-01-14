package utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;
	@BeforeTest
	public void openBrowser() throws IOException {
		Properties properties=ReadPropertiesFile.readPropertiesFile("C:\\Users\\peal9\\eclipse-workspace1\\Walmart\\confiq.properties");
		String browser=properties.getProperty("browser");
		String site=properties.getProperty("url");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\peal9\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		    driver= new ChromeDriver();
		    }
		    else if(browser.equals("firefox")) {
		    	System.setProperty("webdriver.gecko.driver","C:\\Users\\peal9\\Downloads\\geckodriver_win32\\geckodriver.exe");	
			    driver= new FirefoxDriver();
		    }
		    driver.get(site);
		    driver.manage().window().maximize();

		  
		   
		}
		
				
	
	public void setUpBrowser() {
		
	}
	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
