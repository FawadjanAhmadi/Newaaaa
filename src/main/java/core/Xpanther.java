package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpanther {

	public static void main(String[] args) throws InterruptedException {
	
		   WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://tek-retail-ui.azurewebsites.net/");
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        WebElement signInBttn = driver.findElement(By.xpath("//button[@id='signinBtn']"));
	        signInBttn.click();
	       Thread.sleep(3000);
	        WebElement createNewAcct = driver.findElement(By.xpath("//button[@class='login__account-btn']"));
	        createNewAcct.click();
	        Thread.sleep(3000);
	        WebElement name = driver.findElement(By.xpath("//input[@id='nameInput']"));
	        name.sendKeys("David Colunga");
	        Thread.sleep(3000);
	        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	        //make sure to user different email address when you are running this code
	        email.sendKeys("davidcolunga33333@gmail.com");
	        Thread.sleep(3000);
	        WebElement password = driver.findElement(By.xpath("//input[@id='passwordInput']"));
	        password.sendKeys("DAVIDcoclungbaa@2022");
	        Thread.sleep(3000);
	        WebElement confirmPass = driver.findElement(By.xpath("//input[@id='confirmPasswordInput']"));
	        confirmPass.sendKeys("DAVIDcoclungbaa@2022");
	        Thread.sleep(3000);
	        WebElement signUpBttn = driver.findElement(By.xpath("//button[@class='signup__btn']"));
	        signUpBttn.click();
	        Thread.sleep(3000);
	        //from this line below we will practice with contains, starts-with, text, contains and text, and and or
	        WebElement phoneNum = driver.findElement(By.xpath("//input[contains(@id,'phoneNumber')]"));
	        phoneNum.sendKeys("402-555-5151");
	        Thread.sleep(3000);
	        WebElement cardNum = driver.findElement(By.xpath("//input[starts-with(@id,'cardNumber')]"));
	        cardNum.sendKeys("1111111111111111");
	        Thread.sleep(3000);
	        WebElement nameOnCard = driver.findElement(By.xpath("//input[@name='nameOnCard' and @id='nameOnCardInput']"));
	        nameOnCard.sendKeys("David Colunga");
	        Thread.sleep(3000);
	        WebElement expDayDropDown = driver.findElement(By.xpath("//select[starts-with(@id,'expirationMon')]"));
	        expDayDropDown.click();
	        Thread.sleep(3000);
	        WebElement expDay = driver.findElement(By.xpath("//option[text()='11']"));
	        expDay.click();
	        Thread.sleep(3000);
	        WebElement expMonDropDown = driver.findElement(By.xpath("//select[contains(@id,'YearInput')]"));
	        expMonDropDown.click();
	        Thread.sleep(3000);
	        WebElement expMon = driver.findElement(By.xpath("//option[text()='2023']"));
	        expMon.click();
	        Thread.sleep(3000);
	        WebElement cvsCode = driver.findElement(By.xpath("//input[@name='securityCode' or @id='tekschool']"));
	        cvsCode.sendKeys("456");
	        Thread.sleep(3000);
	        WebElement addYourCardBttn = driver.findElement(By.xpath("//button[contains(text(),'Add Your')]"));
	        addYourCardBttn.click();
	        //Code for 10/11/2022 => adding address to customer account
	        //XPath Axes methods
	        
	       WebElement AddressBTN= driver.findElement(By.xpath("//div[@class='account__address-new-wrapper']"));
	       AddressBTN.click();
WebElement fullname = driver.findElement(By.xpath("//form[@class='account__form']//div//descendant::input[@name='fullName']"));
fullname.sendKeys("David Colunga");
WebElement phonNo = driver.findElement(By.xpath("//form[@class='account__form']//div[3]//child::input[@id='phoneNumberInput']"));
phonNo.sendKeys("916-670-4323");
WebElement address = driver.findElement(By.xpath("//input[@id='streetInput']"));
address.sendKeys("3434 esison ave california");
WebElement city = driver.findElement(By.xpath("//div[@class='account__address-new-padding']//following-sibling::input[@name='city']"));
city.sendKeys("sacramento");
WebElement state = driver.findElement(By.xpath("//select[@class='account__address-new-dropdown']//self::select[@name='state']"));
Select select = new Select(state);
select.selectByVisibleText("Alaska");

WebElement zipcode = driver.findElement(By.xpath("//input[@name='zipCode']"));
zipcode.sendKeys("95821");
WebElement addbutton =  driver.findElement(By.xpath("//button[text()='Add Your Address']"));
addbutton.click();
WebElement day= driver.findElement(By.xpath("//select[@name='expirationMonth']//child::option[text()='11']"));
day.click();

Select select1 = new Select(day);
select1.selectByVisibleText("14");

	}

}
