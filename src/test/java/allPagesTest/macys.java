package allPagesTest;

import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class macys {
	WebDriver dr;  
    
   @Test(dataProvider="search", dataProviderClass= DataproviderClass.class)
	public void openBrowser(String search) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\peal9\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	    dr= new ChromeDriver();
	    dr.get("https://www.walmart.com");
	    //dr.manage().window().fullscreen();
	    dr.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys();
		dr.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys(Keys.ENTER);
		dr.findElement(By.xpath("//button[@id='searchSubmit']")).click();
		List<WebElement> elements = dr.findElements(By.xpath("//ul[@class='items small-block-grid-2 large-block-grid-3']/li/div/div/a"));
		List<WebElement> sizeOption = dr.findElements(By.xpath("//ul[@class='medium-float-children swatches-scroller c-reset']/li"));
		
		Iterator<WebElement> it = elements.iterator();
		
		while(it.hasNext()) {
			it.next().click();
			for(WebElement e:sizeOption) {
				e.click();
			}
			dr.navigate().back();
			
		}
		
		//dr.findElement(By.xpath("//img[@id='img_6616887']")).click();
		//List<WebElement> elements= dr.findElements(By.xpath("//div[@class='collapsed row']"));
		
//	    for(int i = 0; i<elements.size();i++) {
//	    	elements.get(i).click();
//	    }
	   
		
	}
    
    
	

	
	
	
	
	
	
	
	
	

}
