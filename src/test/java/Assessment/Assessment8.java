package Assessment;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

                                    //Info : Assessment 8 - Drag and Drop //


public class Assessment8 {

	public class Jqueryui {
		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void OpenURL() {
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
	
			@Test(priority = 2)
			public void Test2() {
			
			Actions actions = new Actions(driver);	
			
			WebElement Iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(Iframe);
			WebElement Drag = driver.findElement(By.xpath("//div[contains(@class ,'ui-widget-content ui-draggable')] "));
			WebElement Drop = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']\"))"));
			actions.dragAndDrop(Drag, Drop).build().perform();
	
			//actions.dragAndDrop(driver.findElement(By.xpath("//div[contains(@class ,'ui-widget-content ui-draggable')] ")), (driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']")))).build().perform();
		
	}
//			@AfterTest
//			public void close() {
//			driver.close();
	    }
	  }	
	