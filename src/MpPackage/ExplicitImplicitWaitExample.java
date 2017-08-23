package MpPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitImplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******** Steps  Started *************");
		String url = "https://www.Google.co.in/";
		String srchText = "Synechron";
		System.setProperty("webdriver.chrome.driver", "C:\\Sanjeev\\driverfiles\\ChromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to(url);
		
		driver.findElement(By.id("lst-ib")).sendKeys(srchText);
		driver.findElement(By.name("btnK")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Careers")));
		driver.findElement(By.linkText("Careers")).click();		
		Assert.assertEquals(driver.getTitle().trim(), "Synechron - Careers");
		driver.close();
		System.out.println("******** Steps  Completed *************");
	}

}
