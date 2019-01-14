package allPagesTest;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;

import allPages.HomePage;
import allPages.SignInPage;
import utilities.BaseTest;
import utilities.DataProviderMethods;
import utilities.ReadPropertiesFile;

public class HomePageTest extends BaseTest {
	
//this test case will verify the url
	HomePage homepage;
	SignInPage signInPage;
	DataProviderMethods dataProviderMethods;
	/*
	 * @Test(priority=0) public void verifyTheUrl() throws IOException { String
	 * actual=driver.getCurrentUrl(); Properties
	 * properties=ReadPropertiesFile.readPropertiesFile(
	 * "C:\\Users\\peal9\\eclipse-workspace1\\Walmart\\confiq.properties"); String
	 * expected=properties.getProperty("url"); Assert.assertEquals(actual,
	 * expected);
	 * 
	 * }
	 * 
	 * @Test(priority=1) public void verifyLogoIsdisplayed() { homepage= new
	 * HomePage(driver); homepage.checkLogo(); }
	 */
	
	@Test(dataProvider="FILE_NAME", dataProviderClass= DataProviderMethods.class)
	public void signInTest( String first,String last,Object mobile,String  email,String password) {
		//homepage= new HomePage(driver);
		//homepage.clickOnSignIn();
		SignInPage signUp= new SignInPage(driver);
		driver.get("https://secure.nordstrom.com/"
				+ "signin?cm_sp=SI_SP_A-_-SI_SP_B-_-SI_SP_C&origin=tab"
				+ "&ReturnURL=https%3A%2F%2Fshop.nordstrom.com%2F");
		signUp.clickOnSignInButton(first, last, mobile, email, password);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
