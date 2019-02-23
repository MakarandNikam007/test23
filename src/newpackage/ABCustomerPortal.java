package newpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ABCustomerPortal extends mutualfundhomepage{
	@BeforeTest
	public void start() throws InterruptedException
	{
		homepage();
	}
	@Test
	public void ProtectingSection() throws InterruptedException
	{
		driver.navigate().to(prop.getProperty("CustPortalProtecting"));
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div[5]/div[2]/div/a[2]/div[2]/span")));
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div/a[2]/div[2]/span")).click();
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void end()
	{
		driver.close();
	}

}
