package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IDname_classname {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com");

driver.manage().window().maximize();


		WebElement  element1 =driver.findElement(By.name("field-keywords"));
	element1.click();
element1.sendKeys("Alexa");
element1.click();
WebElement  element2 =driver.findElement(By.id("nav-search-submit-button"));
element2.click();
WebElement  element3 =driver.findElement(By.className("s-image"));
element3.click();

	}

}
