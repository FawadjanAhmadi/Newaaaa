package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClass {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.ebay.com");

driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebElement electronic = driver.findElement(By.linkText("Electronics"));
Actions action = new Actions(driver);
action.moveToElement(electronic).perform();

WebElement viedioqame = driver.findElement(By.linkText("Video Games"));
viedioqame.click();

WebElement rightclick = driver.findElement(By.className("b-img"));
Actions actiona = new Actions(driver);
actiona.contextClick(rightclick).perform();
actiona.keyDown(Keys.CONTROL);
	}

}
