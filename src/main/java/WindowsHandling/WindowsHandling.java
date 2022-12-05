package WindowsHandling;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent or main Window: "+parentWindow);
		
		
WebElement newWindow= driver.findElement(By.id("newWindowBtn"));
newWindow.click();

Set<String>AllWindows = driver.getWindowHandles();

java.util.Iterator<String> it = AllWindows.iterator();
while(it.hasNext()) {
	it.next();
	String childWindow=it.next();
	if(!parentWindow.equals(childWindow)) {
		driver.switchTo().window(childWindow);
		break;
	}
}
WebElement Windo= driver.findElement(By.id("selectnav1"));
Select select = new Select(Windo);
select.selectByVisibleText("-- Selenium Java");

driver.close();
driver.switchTo().window(parentWindow);

	}

}
