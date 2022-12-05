package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedTest {
public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com");
driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(0));
driver.manage().window().maximize();	
		WebElement  element1 =driver.findElement(By.id(""));
		
		
		
		
}
}
