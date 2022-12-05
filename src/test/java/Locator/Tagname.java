package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagname {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://tek-retail-ui.azurewebsites.net");

driver.manage().window().maximize();

WebElement  element1 =driver.findElement(By.tagName("h1"));

System.out.println(element1.getText());

	}

}
