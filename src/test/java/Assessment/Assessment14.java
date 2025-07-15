package Assessment;

                                      
                         //Info : Assessment -14 - Scroll down Option in Orange HRM //



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assessment14 {

	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void Url() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	
	@Test(priority = 1)
    
    public void TestOne() {
        WebElement UserNameTextBox = driver.findElement(By.name("username"));
       
        UserNameTextBox.sendKeys("Admin");

        WebElement PasswordTextBox = driver.findElement(By.name("password"));
        PasswordTextBox.click();
        PasswordTextBox.sendKeys("admin123");

        WebElement LoginBtn = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]"));
        LoginBtn.submit();
        
    }
	@Test(priority = 2)
	
	
	public void TestTwo() {
		WebElement AdminPageLink = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']"));
		AdminPageLink.click();
	}
	
	
	@Test(priority = 3)
	public void TestThree()  {
	
		WebElement Organization = driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and text()=\"Organization \"]"));
		Organization.click();
		
		WebElement Location = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and text()='Locations']"));
		Location.click();
		
		WebElement CountryScollDownClick = driver.findElement(By.xpath("//div[text()='Country']/div"));
		CountryScollDownClick.click();
		
		WebElement Ascending = driver.findElement(By.xpath("//div[text()='Country']/following::span[text()='Ascending'][1]"));

		JavascriptExecutor Ascendings = (JavascriptExecutor)driver;
		Ascendings.executeScript("arguments[0].click();", Ascending);
		
	}
	
}
