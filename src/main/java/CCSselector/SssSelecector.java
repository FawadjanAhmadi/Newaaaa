package CCSselector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SssSelecector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Fawad");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Ahmadi");
		driver.findElement(By.cssSelector("input[name=\"reg_email__\"]")).sendKeys("Ahmadi@554@yahoo.com");	
		
				driver.findElement(By.cssSelector("input[name^=\"reg_pa\"]")).sendKeys("Ahmadi554$");
						driver.findElement(By.cssSelector("select[id$=\"month\"]")).click();
						
				driver.findElement(By.cssSelector("select[name='birthday_month']>option:nth-of-type(5)")).click();
				
				driver.findElement(By.cssSelector("select[id=\"day\"]>option:nth-of-type(4)")).click();
				
						driver.findElement(By.cssSelector("select[name='birthday_year']")).click();
				
				driver.findElement(By.cssSelector("select[name='birthday_year']>option:nth-of-type(8)")).click();
				
				driver.findElement(By.cssSelector("input[value=\"2\"]")).click();
	}
}
