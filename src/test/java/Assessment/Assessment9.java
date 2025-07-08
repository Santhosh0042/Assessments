package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assessment9 {

	public class Tests {
		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void OpenURL() {
			driver.get("https://www.amazon.in/ref=nav_logo");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
	
			@Test(priority = 1)
			public void Test1() {
	
//				WebElement GoTOTomorrow = driver.findElement(By.xpath("//li[@id='p_90/6741118031']//input[@type='checkbox']"));
//				GoTOTomorrow.click();
//	
			
	        WebElement ReturnOrder = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']//span[text()='Returns']"));
	        ReturnOrder.click();
	        
	      driver.navigate().to("https://www.spicejet.com/");
			
}
}
}