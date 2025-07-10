package Assessment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                          //Info : Assessment 11 - ShadowRoots in Gingr//
public class Assessment12 {

		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void OpenURL() {
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
	
			@Test(priority = 1)
			public void Test1() {
				
	//document.querySelector('#shadow-host').shadowRoot.querySelector('#my-btn')
	//document.querySelector('.smart-ui-component').shadowRoot.querySelector('#menuItemsGroup4a37')				
	//		
				}
	}
	
	

