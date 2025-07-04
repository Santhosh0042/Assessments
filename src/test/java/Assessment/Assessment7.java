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

                                    //Info : Assessment 7 - MouseOver in rahul shetty//


public class Assessment7 {

	public class TestPage {
		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void OpenURL() {
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
	
			@Test(priority = 2)
			public void Test2() {
			
			Actions actions = new Actions(driver);	
			
			WebElement MouseOver = driver.findElement(By.id("mousehover"));
			actions.moveToElement(MouseOver).build().perform();
			
			WebElement TopOption = driver.findElement(By.linkText("Top"));
			TopOption.click();
			}
			
			@Test(priority = 3)
			public void Test3() {
			Actions actions = new Actions(driver);	
				
			WebElement MouseOver = driver.findElement(By.id("mousehover"));
			actions.moveToElement(MouseOver).build().perform();
			
			WebElement ReloadOption = driver.findElement(By.linkText("Reload"));
			ReloadOption.click();
	   }
			@AfterTest
			public void Close() {
			driver.close();
			}
    }
}
