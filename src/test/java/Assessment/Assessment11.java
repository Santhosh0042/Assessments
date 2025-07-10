package Assessment;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;
	import org.testng.annotations.AfterTest;
	import org.openqa.selenium.interactions.Actions;

	                             //Info : Assessment 2 - Amazon Drop down X paths//
	
	public class Assessment11 {
	WebDriver driver = new ChromeDriver();

	@BeforeTest()
	public void OpenURL() {
	driver.get("https://practice.expandtesting.com/upload");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}		
	@Test
	public void ChooseFile() {
			
	
	WebElement ChooseFile = driver.findElement(By.id("fileInput"));
	//ChooseFile.click();
	String FilePath = "C:\\Users\\Dell\\Downloads\\bike.webp";
	ChooseFile.sendKeys(FilePath);
	
	
	WebElement Upload = driver.findElement(By.id("fileSubmit"));
	Upload.submit();
			
			
			
		
			
    }
}