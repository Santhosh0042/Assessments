	package MavenAlert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.Alert;


	public class alert {
	WebDriver driver= new ChromeDriver();

	@BeforeTest
	public void BeforeTest() throws InterruptedException {
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void TestCase1() throws InterruptedException {
		driver.findElement(By.id("alertexample")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
	@Test(priority = 2)
	public void TestCase2() throws InterruptedException {
		driver.findElement(By.id("confirmexample")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}
	@Test(priority = 3)
	public void TestCase3() throws InterruptedException {
		driver.findElement(By.id("confirmexample")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
	}
	@Test(priority = 4)
	public void TestCaseFou4() throws InterruptedException {
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().sendKeys("Name");
		driver.switchTo().alert().accept();
		Thread.sleep(5000);

	}

	@Test(priority = 5)
	public void TestCaseFive() throws InterruptedException{
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().sendKeys("Santhosh");
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);

	}

	@AfterTest
	public void close(){
		driver.close();
	}

}
