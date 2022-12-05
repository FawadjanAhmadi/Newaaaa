package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementMethod {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://tek-retail-ui.azurewebsites.net");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement signinbttn = driver1.findElement(By.id("signinBtn"));

		System.out.println(signinbttn.getTagName());
		System.out.println(signinbttn.getCssValue("background-color"));
		System.out.println(signinbttn.getAttribute("id"));
		System.out.println(signinbttn.getDomProperty("innerHTML"));

		WebElement signinbttn1 = driver1.findElement(By.id("signinBtn"));
		System.out.println(signinbttn1.getSize().getWidth());
		System.out.println(signinbttn1.getLocation());
		System.out.println(signinbttn1.getLocation().x);
		System.out.println(signinbttn1.getLocation().y);
		
		
		
		
	}
.l]
}
