package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializBrowser {

	public static WebDriver driver;
	public static void luanchBrowser(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver drive=new ChromeDriver();
		drive.get(url);
		drive.manage().window().maximize();
		drive.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(5000);
		//drive.close();
		
	}
}
