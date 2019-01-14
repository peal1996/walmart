package allPagesTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Walmart {
	WebDriver dr;
    
	   @Test
		public void openBrowser() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\peal9\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		    dr= new ChromeDriver();
		    dr.get("https://www.walmart.com");
		    dr.manage().window().maximize();;
//		    dr.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys(search,Keys.ENTER);
//		    List<WebElement> list= dr.findElements(By.xpath("//ul[@class='search-result-gridview-items four-items']/li"));
//		   List<WebElement> sizeoption= dr.findElements(By.xpath("//div[@class='variants-container variant-content-tiles-outer-wrapper']//div[@class='variant-options-container']"));
//		   
//		   Iterator<WebElement> it=list.iterator();
//		    while(it.hasNext()) {
//		    it.next().click();
//		   
//		    scroll();
//		    for(WebElement e:sizeoption) {
//		    	e.click();
//		    	scroll();
//		    }
//		    
//		    dr.navigate().back();
//	
//		    }
		    //element.getCssValue("background-color");
		    
		    WebElement e = dr.findElement(By.xpath("//span[@class='elc-icon elc-icon-spark']"));
		    String s = e.getCssValue("color");
		    if(s.equals(2929929))
		    System.out.println(s);
		    
	
	   }
	
	
	
//	
//	public void scroll() {
//		JavascriptExecutor jsx = (JavascriptExecutor)dr;
//	    jsx.executeScript("window.scrollBy(0,450)", "");
//	    jsx.executeScript("window.scrollBy(0,450)", "");
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
