package plainTest;

public class inheritance {
	 
	public void openBrowser()
	{
		System.out.println("browser opens succesfully");
		
	}
	public void openApp()
	{
		System.out.println("www.amazon.com");
	}
	public static void main(String[] args) {
		inheritance obj=new inheritance();
		
		obj.openBrowser();
		obj.openApp();
		
	}

}

