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

                                 //Info : Assessment 1 - OrangeHrm Login //

public class Assessment1 {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait;
	@BeforeTest
	public void OpenURL() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	
	@Test(priority = 1)
    
    public void TestOne() throws InterruptedException {
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
	public void TestThree() throws Exception {
		
		WebElement UserAddBtn = driver.findElement(By.xpath("//button[contains(@class,'oxd-button') and normalize-space()='Add']"));
		UserAddBtn.click();
		
		
		WebElement UserDropDownOption = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		UserDropDownOption.click();
		
		WebElement ListItem = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']"));
		ListItem.click();
		
		WebElement ToGetUserName = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String Name = ToGetUserName.getText();
		
		WebElement EmployeeNameTextBox = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		EmployeeNameTextBox.click();
		EmployeeNameTextBox.sendKeys(Name);
		
		WebElement StatusDropDown = driver.findElement(By.xpath("//label[text()='Status']/following::div[contains(@class,'oxd-select-wrapper')]//div[@class='oxd-select-text--after']"));
		StatusDropDown.click();                                  
		
		WebElement ListItems = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Enabled']"));
		String SelectedStatus = ListItems.getText();
		ListItems.click();
				
		WebElement UserNameTextBox = driver.findElement(By.xpath("//label[text()='Username']/following::input[@class='oxd-input oxd-input--active']"));
		UserNameTextBox.click();
		UserNameTextBox.sendKeys("Santhosh");
				
		WebElement PasswordTextBox = driver.findElement(By.xpath("//label[text()='Password']/following::input[@class='oxd-input oxd-input--active']"));
		PasswordTextBox.click();
		PasswordTextBox.sendKeys("santhosh0042");
		
		
		WebElement ConfirmPasswordTextBox  = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[@class='oxd-input oxd-input--active']"));
		ConfirmPasswordTextBox.click();
		ConfirmPasswordTextBox.sendKeys("santhosh0042");
		
		WebElement SaveButton = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-left-space')]"));
		SaveButton.click();
		
		Assert.assertEquals(SelectedStatus, "Enabled", "Does not match");
		System.out.println(SelectedStatus);
		
        WebElement CancelButton = driver.findElement(By.xpath("//button[contains(@class,'ghost')]"));
        CancelButton.click();
	}

@AfterTest
public void CloseURL() {
	
	driver.close();
}

}