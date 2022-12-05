package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement signin = driver.findElement(By.xpath("//button[@class='top-nav__btn']"));
		Thread.sleep(0000);
		signin.click();

		WebElement crearaccount = driver.findElement(By.xpath("//button[@id='newAccountBtn']"));
		Thread.sleep(0000);
		crearaccount.click();

		WebElement entername = driver.findElement(By.xpath("//input[@name='name']"));
		Thread.sleep(0000);
		entername.sendKeys("Fawadjanahmadiii");

		WebElement lastname = driver.findElement(By.id("emailInput"));
		Thread.sleep(0000);
		lastname.sendKeys("Ahmadiw@yahoo.com");

		WebElement pass = driver.findElement(By.name("password"));
		Thread.sleep(0000);
		pass.sendKeys("Faw454343fefedcxc119$");

		WebElement confirmpass = driver.findElement(By.name("confirmPassword"));
		Thread.sleep(0000);
		confirmpass.sendKeys("Faw454343fefedcxc119$");

		WebElement sginup = driver.findElement(By.id("signupBtn"));
		Thread.sleep(0000);
		sginup.click();

	}

}
