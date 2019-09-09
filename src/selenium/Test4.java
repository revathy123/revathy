package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revsn\\eclipse-workspace\\selenium\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement s = driver.findElement(By.xpath("(//span[@class='nav-line-1'])[7]"));
		Actions a = new Actions(driver);
		
	    a.moveToElement(s).perform();
	
		
		WebElement m1 = driver.findElement(By.xpath("(//span[text()='Mobiles, Computers'])"));
		a.moveToElement(m1).perform();
		driver.findElement(By.xpath("(//span[text()='Power Banks'])")).click();
	
	}

}
