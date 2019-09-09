package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revsn\\eclipse-workspace\\selenium\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		 List<WebElement> li = driver.findElements(By.tagName("iframe"));
		int i = li.size();
		System.out.println(i);
		
		//using string id
		 driver.switchTo().frame("a077aa5e");
		 
		 //using String name
		 driver.switchTo().frame("a077aa5e");
		 
		 //
		  driver.switchTo().frame("(//iframe[@src='ads.html'])");

		 WebElement f = driver.findElement(By.xpath("(//iframe[@src='ads.html'])"));
		 
		 driver.switchTo().frame(f);
		 
		 //using index
		 driver.switchTo().frame(0);
		 
		 
	}

}
