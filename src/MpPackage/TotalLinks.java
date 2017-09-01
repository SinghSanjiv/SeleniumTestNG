package MpPackage;

import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TotalLinks {

	@Test
	public static void main1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sanjeev\\driverfiles\\ChromeDriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.co.in");
		List <WebElement> links = driver.findElements(By.tagName("a"));
 
		System.out.println("Total no of links:	"+links.size());
 
		for (int i = 1; i<links.size(); i=i+1)
			System.out.println(links.get(i).getAttribute("name"));
		driver.quit();
	}
}	
