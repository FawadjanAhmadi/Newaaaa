package core;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropDowen {

	public static void main(String[] args) throws InterruptedException {
	
	
		
		   WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://tek-retail-ui.azurewebsites.net/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	        WebElement allDepart = driver.findElement(By.id("search"));
Select select = new Select(allDepart);
select.selectByVisibleText("Computers");
WebElement searchbar = driver.findElement(By.id("searchInput"));
searchbar.sendKeys("i");
//div[@class='search__suggestion-item  ']/div/pre
Thread.sleep(1000);
//div[@class='flex']
List<WebElement> SerachResult = driver.findElements(By.xpath("//div[@class='search__suggestion-item  ']//child::pre"));
System.out.println(SerachResult.size()+"size of webElemnt");
for(WebElement result : SerachResult) {
	if(result.getText().equals(" Port USB Splitter")) {
		result.click();
		break;
	}
}
Thread.sleep(2000);
WebElement usb = driver.findElement(By.xpath("//p[text()='Multi Port USB Splitter']"));
System.out.println(usb.isDisplayed()+" elemnt present");

driver.close();






	}

}
