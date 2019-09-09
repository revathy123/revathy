package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revsn\\eclipse-workspace\\selenium\\div\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		//count of frames
		List<WebElement> frames = driver.findElements(By.tagName( "iframe"));
		int i = frames.size();
		System.out.println(i);
		
		//count of link
		List<WebElement> links = driver.findElements(By.tagName( "a"));
		int l = frames.size();
		System.out.println(l);
		
		
		//count of img
		 List<WebElement> images = driver.findElements(By.tagName( "img"));
		int j = frames.size();
		System.out.println(j);
		

	}

}
