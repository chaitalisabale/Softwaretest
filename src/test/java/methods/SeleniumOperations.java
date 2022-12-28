package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {

     public static  WebDriver driver;
	 public static void browserLaunch(Object[]inputParameters)
	 {
		 String browserName=(String) inputParameters[0];
		 String exe=(String) inputParameters[1];
	 
		 System.setProperty("webdriver.chrome.driver", exe);
		 
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	 }
	
	public static void openApplication(Object[]inputParameters)
	 {
		 String url=(String)inputParameters[0];
		

		 driver.get(url);
	 }
	/* public static void clickOnElement(Object[]inputParameters)
	 {
		 String xpath=(String) inputParameters[0];
		 driver.findElement(By.xpath(xpath)).click();
	 }
	 public static void moveToElement(Object[]inputParameters)
	 {
		 String xpath=(String) inputParameters[0];
		 
		 Actions actions=new Actions(driver);
		 WebElement we= driver.findElement(By.xpath(xpath));
		 actions.moveToElement(we).build().perform();
	 }
	 */
	public static void main(String[] args)
	{
		
		Object[]input = new Object[2];
		
		input[0]="Chrome";
		input[1]="C:\\Users\\sabalcha\\Filpcart\\Flipcart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
		
		Object[]input5 = new Object[1];
		input5[0]="https://www.flipkart.com";
		SeleniumOperations.openApplication(input5);
		/*
		Object[]input2 = new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.openApplication(input2);
		
		Object[]input3 = new Object[1];
		input3[0]=("//*[@class='_1_3w1N']");
		SeleniumOperations.moveToElement(input3);*/
	}

}
