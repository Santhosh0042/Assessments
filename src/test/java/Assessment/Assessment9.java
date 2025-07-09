package Assessment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


                              //Info : Assessment 9 - Alerts//
public class Assessment9 {

	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl() 
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
	@Test()
	public void TestCase1() 
	
	{
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Santhosh");
		
		WebElement alertproperty=driver.findElement(By.id("alertbtn"));
		alertproperty.click();
		Alert alerttext=driver.switchTo().alert();
		String alertbox=alerttext.getText();
		System.out.println(alertbox);
		driver.switchTo().alert().accept();
	
		}
	@Test()
	public void TestCase2() throws InterruptedException
	{
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Reddy");
		
		WebElement alertproperty=driver.findElement(By.id("confirmbtn"));
		alertproperty.click();
		Alert alerttext=driver.switchTo().alert();
		String alertbox=alerttext.getText();
		System.out.println(alertbox);
		driver.switchTo().alert().accept();
	}
	@Test()
	public void TestCase3() throws InterruptedException 
	{
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("SanthoshReddy");
		
		WebElement alertproperty=driver.findElement(By.id("confirmbtn"));
		alertproperty.click();
		Alert alerttext=driver.switchTo().alert();
		String alertbox=alerttext.getText();
		System.out.println(alertbox);
		driver.switchTo().alert().dismiss();
	}
	

}