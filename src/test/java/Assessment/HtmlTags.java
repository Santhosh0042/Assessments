package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HtmlTags {
	
	
	
        WebDriver driver = new ChromeDriver();
        
        @BeforeTest()
        public void Url()
   
   {
        driver.get("https://testpages.eviltester.com/styled/tag/table.html"); // Replace with actual URL
   }
        @Test()
        public void Amounts()
        {
        // XPath to get all rows except the header (starts from row 2)
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='mytable']/tbody/tr[position()>1]"));

        List<List<String>> tableData = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            List<String> rowData = new ArrayList<>();

            for (WebElement cell : cells) {
                rowData.add(cell.getText());
            }

            tableData.add(rowData);
        }

        // Print the extracted table data
        for (List<String> row : tableData) {
            System.out.println(row);
            }
        }
       @AfterTest()
       public void Close()
       {
        driver.quit();
      }
    }
  
