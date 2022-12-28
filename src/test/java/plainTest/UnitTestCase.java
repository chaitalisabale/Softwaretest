package plainTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class UnitTestCase {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabalcha\\Filpcart\\Flipcart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
			}
}
