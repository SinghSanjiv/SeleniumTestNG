package MpPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*import org.openqa.selenium.firefox.FirefoxDriver;
 import org.openqa.selenium.ie.InternetExplorerDriver;*/
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch {
	
		
	
	@Test//(priority=0)
	public static void method2(){
		
		System.out.println("Hello There from TestNG!!");
	}

	@Test//(priority=1)
	public static void mehtod1() throws InterruptedException {
		System.out.println("******** Starts Executions Here *************");
		System.out.println("******** Steps  Started *************");
		String url = "https://www.Google.co.in/";
		String srchText = "Synechron";
		System.setProperty("webdriver.chrome.driver","C:\\Sanjeev\\driverfiles\\ChromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to(url);
		System.out.println("******** Web App Launched *************");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(srchText);
		driver.findElement(By.name("btnK")).click();	//btnK
		// Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Careers")));
		driver.findElement(By.linkText("Career")).click();
		Thread.sleep(2000);
		Assert.assertEquals("Synechron - Careers", driver.getTitle().trim());
		// Checking for existance of the Element to verify the specific page
		// came
		// if(driver.getPageSource().contains("We combine innovative ideas with deep business knowledge and global technology teams to deliver business solutions."))
		if (driver.findElements(By.className("sub_title")).size() != 0) {
			System.out.println("Validated -- Careers page exists!!");
		} else {
			System.out.println("Careers page does not exists!!");
		}
		driver.quit();
		System.out.println("******** Steps  Completed *************");
		System.out.println("******** Stop Execution *************");
	}

	/*	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	}*/

}