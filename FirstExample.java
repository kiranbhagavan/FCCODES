package webdr;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstExample {

	  private static String descr = "ds";
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		
		// https://code.google.com/p/selenium/wiki/ChromeDriver    ChromeDriver 2.12
	//	System.setProperty("webdriver.chrome.driver", 
		//		"C:\\softwares\\chromedriver.exe");
		/*
		 * Exception in thread "main" java.lang.IllegalStateException: The path to the driver executable must be set
		 *  by the webdriver.chrome.driver system property; for more information, see http://code.google.com/p/selenium/wiki/ChromeDriver.
		 *   The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html

		 */
		
		WebDriver driver = new FirefoxDriver();

		// // And now use this to visit Google

		driver.get("http://www.amazon.com");

		
		// // Find the text input element by its name
		
		WebElement element = driver.findElement(By.id("twotabsearchtextbox")); //
		
		 element.sendKeys("iphone");
		 element.submit();
		
	String str= driver.findElement(By.id("s-result-count")).getText();
	
	String[] parts = str.split(" ");
		
	for(int i=0;i<5;i++)
	{
		System.out.println(parts[i]);
	}
	
	System.out.println("Results found="+parts[2]);
	
	}

}