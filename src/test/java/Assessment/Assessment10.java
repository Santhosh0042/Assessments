package Assessment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


                              //Info : Assessment 10 - Doing Get Window handles//
public class Assessment10 {

public class TestPage {
WebDriver driver = new ChromeDriver();

@BeforeTest
public void OpenURL() {
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

@Test(priority = 1)
public void Test1() {

	//driver.getWindowHandle();
	String parentWindow = driver.getWindowHandle();
	WebElement OpenTab = driver.findElement(By.id("opentab"));
	OpenTab.click();
	Set<String> allWindows = driver.getWindowHandles();
			
	for (String windowHandle : allWindows) {
		 if (!windowHandle.equals(parentWindow)) {
		 driver.switchTo().window(windowHandle);
		 break;
		 }
	}
//	QAClick Academy - A Testing Academy to Learn, Earn and Shine
	
	System.out.println("Title of new window: "+ driver.getTitle());
	driver.switchTo().window(parentWindow);
	
	
			//Alert Myalert = driver.switchTo().alert();

        }	
    }
}
