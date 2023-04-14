package plainTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr1 {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\sabalcha\\Filpcart\\Flipcart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/");
	    String title=driver.getTitle();
	    
	    if(title.equals("Google"))
	    {
	    	System.out.println("passtest");
	    }
	    else
	    {
	    	System.out.println("failtest");
	    }
	    String url=driver.getCurrentUrl();
	    
	    if(url.contains("google.com"))
	    {
	    	System.out.println("url has com");
	    	
	    }
	    else
	    {
	    	System.out.println("fail url has com");
	    }
	}

}
