package webdr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyAssigmentTestNG {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test

	public void testAmazon() {

		driver.get("http://www.amazon.com/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");

		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

		// Thread.sleep(2000);

		driver.findElement(By
				.cssSelector("div > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > a"))
				.click();

		driver.findElement(By.id("add-to-cart-button")).click();

		driver.findElement(By.id("hlb-ptc-btn-native")).click();

	}

}