package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath="//*[@viewBox='0, 0, 191, 24']") WebElement logo;
	@FindBy(xpath="//span[@class='Ztr8Q5']") WebElement signInFirstClick;
	//@FindBy(xpath="@FindBy(xpath=\"//span[@class='Ztr8Q5']\") WebElement signin;") WebElement signIn2ndClick;
	public HomePage(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public SignInPage clickOnSignIn() {
		signInFirstClick.click();
		//signIn2ndClick.click;
		return new SignInPage(driver);
	}
	
	public void checkLogo() {
		logo.isDisplayed();
		
	}
	
	

}
