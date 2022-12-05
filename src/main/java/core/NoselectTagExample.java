package core;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoselectTagExample {

	public static void main(String[] args) {
	
		
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.linkText("Create new account")).click();
	        
		  List<WebElement> listofMonth= driver.findElements(By.xpath("//select[@id='month']//child::option"));
	        for(int i=0; i<listofMonth.size(); i++) {
	        	if(listofMonth.get(i).getText().equalsIgnoreCase("Feb")) {
	        		listofMonth.get(i).click();
		        	break;	
	        	}
	        	
	        }
	        
	        List<WebElement> DayofMonth= driver.findElements(By.xpath("//select[@id='day']//child::option"));
	        for(int i=0; i<DayofMonth.size(); i++) {
	        	if(DayofMonth.get(i).getText().equalsIgnoreCase("9")) {
	        		DayofMonth.get(i).click();
		        	break;	
	        	}
	        	
	        }  
	     
	        List<WebElement> year= driver.findElements(By.xpath(" //select[@id='year']//child::option"));
	        for(int i=0; i<year.size(); i++) {
	        	if(year.get(i).getText().equalsIgnoreCase("1986")) {
	        		year.get(i).click();
		        	break;	
	        	}
	        	
	        }  
	        
	        
	        
	}

}
