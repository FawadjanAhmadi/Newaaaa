package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookXpath {

	public static void main(String[] args) throws InterruptedException {
		

		   WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        WebElement creatAccount = driver.findElement(By.xpath("//a[@role='button']//following::a[@role='button']"));
	        creatAccount.click();
	        
	        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	       firstname.sendKeys("Fawad");
	    
	       
	       WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	      lastname.sendKeys("Ahmadi");
	   
	      WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	     email.sendKeys("Ahmadi554@yahoo.com");
	  
	     WebElement email2 = driver.findElement(By.xpath(" //input[@name='reg_email_confirmation__']"));
	     email2.sendKeys("Ahmadi554@yahoo.com"); 
	  
	     WebElement Password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
	    Password.sendKeys("Ahmadi554$"); 
	 
	    WebElement Month = driver.findElement(By.xpath(" //select[@name='birthday_month']//child::option[text()='Feb']"));
	   Month.click();
	
	   WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']//option[text()='6']"));
	  day.click(); 
	
	   WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']//child::option[text()='1988']"));
	 year.click();  
	
	   WebElement SelectGender = driver.findElement(By.xpath("//label[@class='_58mt']//following::label[1]//following::input[@value='2']"));
	   SelectGender.click(); 
	       
	       
	       
	        
		

	}

}
