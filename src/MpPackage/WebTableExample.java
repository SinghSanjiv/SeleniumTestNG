package MpPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("******** Steps  Started *************");
		String url = "https://www.Google.co.in/";
		String srchText = "Synechron";
		System.setProperty("webdriver.chrome.driver", "C:\\Sanjeev\\driverfiles\\ChromeDriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to(url);
		System.out.println("******** Web App Launched *************");
		Thread.sleep(2000);
	}

}
