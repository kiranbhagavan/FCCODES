package webdr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class TestActionsForMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver myTestDriver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", 
		"C:\\softwares\\chromedriver.exe");

          WebDriver Driver = new ChromeDriver();
		
      	Driver.get("http://www.amazon.com");
      	
		Driver.manage().window().maximize();

		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		String MainMenuItem ="//div[2]/div/div/a/span[2]";
								
		                       
		String SubMenuItem = "//div[@id='nav-flyout-shopAll']/div[2]/span[11]/span"; // Mobile
		
		String SubSubMenuItem ="//div[@id='nav-flyout-shopAll']/div[3]/div[11]/div/div/a[4]/span";                      

		WebElement MainMenuItemLink = Driver.findElement(By.xpath(MainMenuItem));		

		Actions builder = new Actions(Driver); 

		builder.moveToElement(MainMenuItemLink).perform();
		

		// sub menu
		
		WebElement SubMenuItemLink = Driver.findElement(By.xpath(SubMenuItem));
		SubMenuItemLink.click();
		
		WebElement SubSubMenuItemLink = Driver.findElement(By.xpath(SubSubMenuItem));
		SubSubMenuItemLink.click();
		
		
		System.out.println("Mouse Hover Complete.");

		//builder.clickAndHold(MainMenuItemLink).perform();

	}

}