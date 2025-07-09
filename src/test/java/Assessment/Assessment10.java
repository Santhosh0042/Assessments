package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                        //Info : Assessment - 10 - Titles of windows in footer page//
public class Assessment10{

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
	
			WebElement RestApi = driver.findElement(By.linkText("REST API"));
			RestApi.click();
			System.out.println("Title of new window: "+ driver.getTitle());

}
			
			
			@Test(priority = 2)
			public void Test2() {
				
			driver.navigate().back();	
	
			WebElement SoapUI = driver.findElement(By.linkText("SoapUI"));
			SoapUI.click();
			System.out.println("Title of new window: "+ driver.getTitle());
			
}
		
			@Test(priority = 3)
			public void Test3() {
				
			driver.navigate().back();	
	
			WebElement Appium = driver.findElement(By.linkText("Appium"));
			Appium.click();
			System.out.println("Title of new window: "+ driver.getTitle());
			
}
			@Test(priority = 4)
			public void Test4() {
				
			driver.navigate().back();	
	
			WebElement JMeter = driver.findElement(By.linkText("JMeter"));
			JMeter.click();
			System.out.println("Title of new window: "+ driver.getTitle());
}
			@AfterTest
			public void Close() {
			driver.close();
			}
	}
}