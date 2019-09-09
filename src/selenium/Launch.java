package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revsn\\eclipse-workspace\\selenium\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		 
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		 
		for (WebElement tRow : rows) {
			
			List<WebElement> cells = tRow.findElements(By.tagName("td"));
			
			for (WebElement tcell : cells) {
				
				String t = tcell.getText();
				
				if (t.equals("Mecca")) {
					
					System.out.println(t);
					
				}
				
				
				
			}
			
		}
		driver.quit();
		
		
		
	} 
}