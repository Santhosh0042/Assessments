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

	public class AmazonOne {
	WebDriver driver = new ChromeDriver();

	@BeforeTest()
	public void OpenURL() {
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}		
	@Test
	public void Locators() {
			
	WebElement AccountAndListsButton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
	AccountAndListsButton.click();
		
	
	WebElement List1= driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/ul/li[1]/a/span"));
	List1.click();
	driver.navigate().back();
			
	WebElement AccountAndListsButtons = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
	AccountAndListsButtons.click();
			
	WebElement List2 = driver.findElement(By.xpath("//span[text()='Wish from Any Website']/ancestor::a[contains(@class,'nav-link')]"));
	List2.click();
	driver.navigate().back();
			
	WebElement List3 = driver.findElement(By.xpath("//span[text()='Baby Wishlist']/ancestor::a[contains(@class,'nav-link')]"));
	List1.click();
	driver.navigate().back();
			
	WebElement List4 = driver.findElement(By.xpath("//span[text()='Discover Your Style']/ancestor::a[contains(@class,'nav-link')]"));
	List1.click();
	driver.navigate().back();
			
	WebElement List5 = driver.findElement(By.xpath("//span[text()='Explore Showroom']/ancestor::a[contains(@class,'nav-link')]"));
	List1.click();
	driver.navigate().back();
			
    
                                                      //Account items
			
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Your Recommendations']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Your Prime Membership']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Your Account']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Your Orders']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Your Wish List']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Your Prime Video']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Your Subscribe & Save Items']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Memberships & Subscriptions']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Your Seller Account']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Manage Your Content and Devices']/ancestor::a[contains(@class,'nav-link')]"));
			//WebElement Account1 = driver.findElement(By.xpath("//span[text()='Register for a free Business Account']/ancestor::a[contains(@class,'nav-link')]"));
			
		}
	
	@AfterTest
	public void CloseURL() {
	driver.close();
	}
}

