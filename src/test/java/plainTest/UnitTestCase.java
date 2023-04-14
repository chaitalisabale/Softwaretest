package plainTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class UnitTestCase {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabalcha\\Filpcart\\Flipcart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get(" https://phptravels.com/demo/");
		
		driver.findElementByName("first_name").sendKeys("neha");
		
		driver.findElementByName("last_name").sendKeys("patil");
		
		driver.findElementByName("business_name").sendKeys("ABC");
		
		driver.findElementByName("email").sendKeys("neha.patil@gmsil.com");
		
		driver.findElementByClassName("btn w100").click();
		
		driver.findElementByXPath(("//*[@id='number']")).getText();
		
		
			}
}
