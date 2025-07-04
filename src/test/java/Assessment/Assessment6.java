package Assessment;

import java.time.Duration;
                                            //Info : Assessment 6 - RadioButton And CheckBox//

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
 
                         //Info : Assessment 6 - Radio button & Check box//

public class Assessment6 {

	ChromeDriver driver = new ChromeDriver();
	@BeforeTest 
	public void OpenUrl() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test 
	public void RadioButton()
	{
	
	WebElement CheckBox = driver.findElement(By.id("checkBoxOption3"));
	CheckBox.click();
	}
	@Test
	public void Dropdown()
	{
	WebElement Dropdown = driver.findElement(By.xpath("//input[@value='radio2']"));
	Dropdown.click();
	
	}
	@AfterTest
	public void Close() {
	driver.close();
	}
}