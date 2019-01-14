package allPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;
	public SignInPage( WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='firstName']") WebElement firstname;
	@FindBy(xpath="//input[@name='lastName']") WebElement lastname;
	@FindBy(xpath="//input[@name='mobileNumber']") WebElement mobileNumber;
	@FindBy(xpath="//section[contains(@class,'dark_11BwPv brandon_RAXqx medium_dB0hp')]//section//div[4]") WebElement email;
	@FindBy(xpath="(//input[@name=\"password\"])[2]") WebElement password;
	public void clickOnSignInButton(String first,String last,Object mobile,String email,String password) {
		firstname.sendKeys(first);
		lastname.sendKeys(last);
		mobileNumber.sendKeys(mobile.toString());
		this.email.sendKeys(email);
		this.password.sendKeys(password);
	}
	
	
	
	
	
	
	
	
	
	
	
}
