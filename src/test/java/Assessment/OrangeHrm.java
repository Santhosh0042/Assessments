package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrm {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest()
	public void OpenUrl() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test ()
	public void TestOne()
	{
    WebElement UserName = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']"));
    UserName.sendKeys("Admin");
    
    WebElement Password =driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
    Password.sendKeys("admin123");
    
    WebElement LoginButton = driver.findElement(By.xpath("//button[contains(@class ,'main orangehrm-login-button')]"));
    LoginButton.click();
    }
	
	@Test()
	public void TestTwo()
	{
		
	WebElement AdminBox = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']"));
	AdminBox.click();	
		
	WebElement JobButton = driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Job']"));
	JobButton.click();	
	
	WebElement JobTitleButton = driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']"));
	JobTitleButton.click();
	
	WebElement AddButton = driver.findElement(By.xpath("//button[contains(@class ,'oxd-button oxd-button--medium')]"));
	AddButton.click();
	
	
	
	
	
	
	
	
	
		
		
	}
}
