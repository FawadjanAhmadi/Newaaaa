package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyUstadCode {


		public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	        //name
	        WebElement element5 = driver.findElement(By.name("email"));
	        element5.sendKeys("panthers@gamil.com");
	        WebElement element6 = driver.findElement(By.name("pass"));
	        element6.sendKeys("123456");
	        
	        //tagName
	        //If you want to check to see how many of the tagName you are trying to use
	        //are there in the DOM, click in the DOM and then press Ctrl + F and you will see a
	        //search bar open in the botton of you DOM, you can type two forward slashes and then
	        //the tagName, you can see how many of those tags are there
	        WebElement element7 = driver.findElement(By.tagName("h2"));
	        //getText();
	        //getText() is a webelement method. Once we locate an element with text, and we
	        //call the getText() element method, it would return the text value for that
	        //element
	        String str7 = element7.getText();
	        System.out.println(str7);
//	        System.out.println(element7.getText());
	        
	        
	        Thread.sleep(6000);
	        driver.close();
	    }

	}


