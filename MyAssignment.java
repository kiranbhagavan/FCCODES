package webdr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class MyAssignment {

	public static void main(String args[]) throws Exception {
		// https://code.google.com/p/selenium/wiki/ChromeDriver ChromeDriver
		// 2.12
		
		
		System.setProperty(
						"webdriver.chrome.driver",
						"C:\\softwares\\chromedriver.exe");

		//         WebDriver driver = new HtmlUnitDriver(); //1

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.get("http://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		

		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		
	
		
		driver.findElement(By.cssSelector("div > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > a")).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		
		
		/* String text =driver.findElement(By.cssSelector("div#content div.box div.head h1")).getText();
		
		Assert.assertTrue(text.equals("Dashboard"));
		
		if (driver.getTitle().equals("OrangeHRM")) {
			System.out.println("admin page Displayed successfully");
			Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Admin page assert");
		} else {
			System.out.println("Do not Displayed");
		}

		

			*/
		
		 
	}
}