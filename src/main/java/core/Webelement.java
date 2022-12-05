package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ligin = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		ligin.click();

		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("fawad");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Ahmadi");
	
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("fawadAhmadi@yahoo.com");
		
		WebElement email1 = driver.findElement(By.name("reg_email_confirmation__"));
		email1.sendKeys("fawadAhmadi@yahoo.com");
		
		WebElement pass = driver.findElement(By.id("password_step_input"));
		pass.sendKeys("Alugrgff54$");	
		
		WebElement radiobtn = driver.findElement(By.name("sex"));
		radiobtn.click();
		
	WebElement Month = driver.findElement(By.xpath("//SELECT[@name='birthday_month']//child::option[text()='Feb']"));
	Month.click();
	
	
	
	
	
	
	}}