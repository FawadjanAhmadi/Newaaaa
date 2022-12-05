package core;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethod1 {

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.linkText("Create new account")).click();
		
		 List<WebElement> listofMonth= driver.findElements(By.xpath("//select[@id='month']//child::option"));
		 getElementBaseOnVisibleText(listofMonth, "Feb");
		 
		 
		 List<WebElement> DayofMonth= driver.findElements(By.xpath("//select[@id='day']//child::option"));
		 getElementBaseOnVisibleText(DayofMonth, "14");
		 
		 
		 List<WebElement> year= driver.findElements(By.xpath(" //select[@id='year']//child::option"));
		 getElementBaseOnVisibleText(year, "1988");
	}
public static void getElementBaseOnVisibleText(List<WebElement> list, String text ) {
	for (WebElement element : list) {
		if(element.getText().equalsIgnoreCase("text")) {
			element.click();
			break;
		}
	}
}
	
	
	
}
