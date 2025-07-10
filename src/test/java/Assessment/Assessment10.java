package Assessment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                        //Info : Assessment - 10 - Titles of windows in footer page//
public class Assessment10   {

	        public class Tests {
		    WebDriver driver = new ChromeDriver();
		
		    @BeforeTest
		    public void OpenURL() {
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
	
			@Test(priority = 1)
			public void Test1() {
	
				
			Actions action = new Actions(driver);
			WebElement RestApi = driver.findElement(By.linkText("REST API"));
			action.keyDown(Keys.SHIFT).click(RestApi).keyUp(Keys.SHIFT).build().perform();
			
			String ParentWindow = driver.getWindowHandle();
			Set<String> AllWindows = driver.getWindowHandles();
			for(String WindowHandle : AllWindows) {
			if(!WindowHandle.equals(ParentWindow)) {
			driver.switchTo().window(WindowHandle);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			}
			
			}
			System.out.println("Title of new window: "+ driver.getTitle());
            driver.close();
			driver.switchTo().window(ParentWindow);
}
			
			
			@Test(priority = 2)
			public void Test2() {
            
			Actions action = new Actions(driver);
			WebElement SoapUI = driver.findElement(By.linkText("SoapUI"));
			action.keyDown(Keys.SHIFT).click(SoapUI).keyUp(Keys.SHIFT).build().perform();
			
			String ParentWindow = driver.getWindowHandle();
			Set<String> AllWindows = driver.getWindowHandles();
			for(String WindowHandle : AllWindows) {
				if(!WindowHandle.equals(ParentWindow)) {
					driver.switchTo().window(WindowHandle);
					WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
					wait.until(ExpectedConditions.titleIs("The World's Most Popular API Testing Tool | SoapUI"));

				}
			}
			System.out.println("Title of new window: "+ driver.getTitle());
			driver.close();
			driver.switchTo().window(ParentWindow);
}
		
			@Test(priority = 3)
			public void Test3() {
				
			Actions action = new Actions(driver);
	
			WebElement Appium = driver.findElement(By.linkText("Appium"));
			action.keyDown(Keys.SHIFT).click(Appium).keyUp(Keys.SHIFT).build().perform();
			
			String ParentWindow = driver.getWindowHandle();
			Set<String> AllWindows = driver.getWindowHandles();
			for(String WindowHandle : AllWindows) {
				if(!WindowHandle.equals(ParentWindow)) {
					driver.switchTo().window(WindowHandle);
					WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

				}
			}
			System.out.println("Title of new window: "+ driver.getTitle());
			driver.close();
			driver.switchTo().window(ParentWindow);
}
			@Test(priority = 4)
			public void Test4() {
				
			
			Actions action = new Actions(driver);
			
			WebElement JMeter = driver.findElement(By.linkText("JMeter"));
			action.keyDown(Keys.SHIFT).click(JMeter).keyUp(Keys.SHIFT).build().perform();
			
			String ParentWindow = driver.getWindowHandle();
			Set<String> AllWindows = driver.getWindowHandles();
			for(String WindowHandle : AllWindows) {
				if(!WindowHandle.equals(ParentWindow)) {
					driver.switchTo().window(WindowHandle);
					WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

					}
			}
			System.out.println("Title of new window: "+ driver.getTitle());
			driver.close();
			driver.switchTo().window(ParentWindow);
			}
			
			@AfterTest
			public void Close() {
			driver.close();
			}
	}
}