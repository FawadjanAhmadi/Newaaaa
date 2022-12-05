package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SReusableMethodGaceBook {

	public static void main(String[] args) {
		
		   WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.linkText("Create new account")).click();
	      //MONTH
	        WebElement month= driver.findElement(By.id("month"));
	        selectByVisibleText(month,"Jun");
	        
	        WebElement day= driver.findElement(By.id("day"));
	        selectByVisibleText(day, "3");
	        
	       WebElement year = driver.findElement(By.id("year"));
	       selectByVisibleText(year, "1988");
	           
	}
	 
    public static void  selectByVisibleText(WebElement element, String  VisibleText) {
  	  Select select =new Select(element);
  	  select.selectByVisibleText(VisibleText);
    }
}
