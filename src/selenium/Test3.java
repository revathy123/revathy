package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revsn\\eclipse-workspace\\selenium\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement drop= driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		
	}

}
