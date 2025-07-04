package Assessment;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

                            //Info : Assessment 5 - RahulShetty Drop down x paths For Selecting countries option//


public class Assessment5 {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OPenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void Test1() {
	WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
	dropDown.click();
	Select select = new Select(dropDown);
	select.selectByVisibleText("Option3");
		
	//select.getFirstSelectedOption();
		
	WebElement getOption = select.getFirstSelectedOption();
	System.out.println(getOption.getText());
		
    }
	
    @Test
	public void Test2() {
	WebElement TypeToSelectCountries = driver.findElement(By.id("autocomplete"));
	//
	TypeToSelectCountries.click();
	TypeToSelectCountries.sendKeys("ind");
	
	

	List<WebElement> dropdownOptions = driver.findElements(By.xpath("//li[contains(@class, 'ui-menu-item')]/div"));
		
	for(WebElement options:dropdownOptions) {
	if(options.getText().equalsIgnoreCase("india")) {
	options.click();
	
		}
    }
    String selectedValue = TypeToSelectCountries.getAttribute("value");
    System.out.println(selectedValue);
 
	}
	@AfterTest
	public void Close() {
	driver.close();
	}
}