package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revsn\\eclipse-workspace\\selenium\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement m1 = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[21]"));
		Actions a =new Actions(driver);
		a.moveToElement(m1).perform();
		WebElement b = driver.findElement(By.xpath("(//strong[text()='Smart Phones'])"));
		b.click();
		

	}

}
