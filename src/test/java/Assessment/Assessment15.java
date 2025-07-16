package Assessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assessment15 {

	public class Assessment14 {

		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void Url() {
			
			driver.get("https://www.worldometers.info/world-population/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		
		
		@Test(priority = 1)
	    
	    public void TestOne() {
	    
		WebElement IndiaPopulationValue = driver.findElement(By.xpath("//span[@rel='india-population']"));
		String populationText = IndiaPopulationValue.getText(); // Get visible text
	    System.out.println("India Population: " + populationText);
        
	    WebElement Table = driver.findElement(By.xpath("//div[@class='grid grid-cols-1 lg:grid-cols-2 lg:gap-4 mt-2']"));
		String TableText = IndiaPopulationValue.getText(); // Get visible text
	    System.out.println("Table: "+ TableText);
	    
	    List<WebElement> Tab = driver.findElements(By.xpath("//div[@class='grid grid-cols-1 lg:grid-cols-2 lg:gap-4 mt-2']"));
	    List <String> Values = new ArrayList<String>();	    
	    for (WebElement tab : Tab) {		
		Values.add(tab.getText());
	    }
		 for (String VALUES : Values) {
			 System.out.println(VALUES);
		     }	
		  }
	   }
	}