package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revsn\\eclipse-workspace\\selenium\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/software-testing.html");
		WebElement m = driver.findElement(By.xpath("(//a[text()='COURSES'])"));
		Actions a = new Actions(driver);
		a.moveToElement(m).perform();
		WebElement m1 = driver.findElement(By.xpath("(//span[text()='Software Testing Training '])"));
		a.moveToElement(m1).perform();
		WebElement b = driver.findElement(By.xpath("(//span[text()='Selenium Training'])"));
		a.moveToElement(b).perform();
		b.click();
		
	}

}
