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

                                 //Info : Assessment 13 - In Orange HRM We Are Doing Xpaths For Locations //

public class Assessment13 {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait;
	@BeforeTest
	public void OpenURL() throws InterruptedException {
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
		
		WebElement DropDown = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		DropDown.click();
		
		WebElement Country = driver.findElement(By.xpath("//span[text()='Afghanistan']"));
		Country.click();
		
        WebElement SearchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        SearchButton.click();
       
	}
	@Test(priority = 4)
    public void TestFour()	{
	
		WebElement AddBtn = driver.findElement(By.xpath("//button[@type='button' and text()=' Add ']"));
		AddBtn.click();
		
		WebElement Name = driver.findElement(By.xpath("//label[contains(text(),'Name')]/ancestor::div[contains(@class,'oxd-input-group')]//input"));
		Name.sendKeys("Santhosh");
		
		WebElement DropDown = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		DropDown.click();
		
		WebElement Country = driver.findElement(By.xpath("//span[text()='Afghanistan']"));
		Country.click();
		
        WebElement SaveButton = driver.findElement(By.xpath("//button[@type='submit' and text()=' Save ']"));
        SaveButton.click();
    	
	}
	@Test(priority = 5)
	public void TestFive() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement DropDown = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		DropDown.click();
		
		WebElement Country = driver.findElement(By.xpath("//span[text()='Afghanistan']"));
		Country.click();
		
        WebElement SearchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        SearchButton.click();
	}
}
	