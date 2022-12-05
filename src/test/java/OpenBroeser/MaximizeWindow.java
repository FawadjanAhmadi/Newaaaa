package OpenBroeser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		
drive.get("https://www.amazon.com");
drive.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(0));
drive.manage().window().maximize();
drive.get("https://www.facebook.com");










	}

}
