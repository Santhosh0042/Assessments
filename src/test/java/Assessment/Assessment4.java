package Assessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  
                           //Info : Assessment 4 - Rahul Shetty Table Data//
public class Assessment4 {

	
	public class TestPage {
		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void OpenURL() {
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
	
			@Test(priority = 2)
			public void TestCase2() {
				
			List <WebElement> List2 = driver.findElements(By.xpath("//table[@class = 'table-display']//tr[position()>1]//td"));
			List<String> AllData = new ArrayList<>();
			
			System.out.println("Table2 Data is: ");
			for(WebElement list2 : List2) {
			AllData.add(list2.getText());
			}
			for(String AllData2 : AllData) {
					
			System.out.println(AllData2);
				}
			}
			@AfterTest
			public void Close() {
			driver.close();
		}
	}
}
