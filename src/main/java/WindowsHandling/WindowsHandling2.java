package WindowsHandling;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling2 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentTab=driver.getWindowHandle();
		WebElement downloadBTTN = driver.findElement(By.linkText("Download"));
		Actions action = new Actions(driver);
action
.keyDown(Keys.CONTROL)
.click(downloadBTTN)
.keyUp(Keys.CONTROL)
.build().perform();

Set<String>allTab = driver.getWindowHandles();
java.util.Iterator<String> it=  allTab.iterator();
while(it.hasNext()) {
	String childTab= it.next();
	if(!parentTab.equals(childTab)) {
		driver.switchTo().window(childTab);
		break;
	}
}

	}

}
