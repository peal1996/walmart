package allPagesTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class PriceFilter extends BaseTest {
 
    @Test
	public void priceFilter() throws InterruptedException {
    	Actions action = new Actions(driver);
    	WebElement we = driver.findElement(By.xpath("//span[@class='searchText_ZCSLvO']"));
    	action.moveToElement(we).build().perform();
    	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='keyword-search-input']")).sendKeys("jeans",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='navigation-mouse browser-chrome browser-chrome71']/div[@class='Z2pWPa5']/div[@class='Z2fcOxB']/div[@class='ZeFBuJ Z2fcOxB']/div[contains(@class,'dark_ZUc1LL brandon_Z1XsMN4 medium_Zc1jvx')]/div[@id='product-results-view']/div[@class='row_ZcHzbz']/div[@class='block_Z1YOfH4']/div[@class='stickyElement_Z2rH2I9']/div[@class='staticElement_lRzH background_1ttseT background_Zmigvi']/div[@class='scrollbar_22os7o']/div[@class='scrollableContent_1ilLae']/div/div[@class='desktop_Z1q0STc']/div/div[@class='accordionGroup_MOKql']/div[4]/a[1]/div[1]/*[1]")).click();
		Thread.sleep(3000);
		List<WebElement> web=driver.findElements(By.xpath("(//div[@class='filterMenu_2nsHrx'])[1]//a"));
		web.get(1).click();
		Thread.sleep(3000);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@data-element='product-module-sale-price product-module-price']/div[2]/span[2]"));
		for(int i = 0;i<elements.size();i++) {
			String s=elements.get(i).getText();
		    System.out.println(s);
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
