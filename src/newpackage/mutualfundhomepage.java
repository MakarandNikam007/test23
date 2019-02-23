package newpackage;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class mutualfundhomepage {
	static File f= new File(System.getProperty("user.dir")+"\\src\\config\\OR.properties");
	static FileInputStream fileInput = null;
	static WebDriver driver = null;
	static Properties prop = null;
	
	public void homepage() throws InterruptedException
	{
		if(driver==null)
		{	
		try{
		fileInput= new FileInputStream(f);
		} catch(FileNotFoundException e){e.printStackTrace();}
		
		prop = new Properties();
		try{
		prop.load(fileInput);
		}
		catch (IOException e){e.printStackTrace();}
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	}	
	
	/*@Test
	public void TC001() throws InterruptedException
	{
		homepage();
		driver.navigate().to(prop.getProperty("MutualFundURL"));
		driver.manage().window().maximize();
		java.util.List<WebElement> allmenulinks= driver.findElements(By.xpath("//a[@class='menu']"));
		System.out.println(allmenulinks.size());
		
		for (int i=0; i<allmenulinks.size(); i++)
		{
			//allmenulinks.get(0).click();
			if (allmenulinks.get(i).getText().matches("Funds & Planning"))
			{
				Actions action = new Actions(driver);
				action.moveToElement(allmenulinks.get(i)).build().perform();
				
				String firstpart="//following-sibling::div//li[1]/ul/li[";
				String secondpart="]/a";
				//java.util.List<WebElement> allsublinks = driver.findElements(By.xpath("//following-sibling::div/li[1]/ul/li"));
				//System.out.println(allsublinks.size());
				for(int j=0; j<allsublinks.size(); j++)
				{
					if (driver.findElement(By.xpath(firstpart+j+secondpart)).getText().matches("Aditya Birla Sun Life Balanced Advantage Fund "))
					{
						driver.findElement(By.xpath(firstpart+j+secondpart)).click();
					}
				}
				driver.findElement(By.xpath("//following-sibling::div//li[1]/ul/li[4]/a")).click();
			}
		}
		
//		Iterator<WebElement> itr = allmenulinks.iterator();
//		while(itr.hasNext())
//		{
//			WebElement link= itr.next();
//			if (link.getText()=="Funds & Planning")
//			{
//				link.g
//				 WebElement element = driver.findElement(link.getAttribute(arg0));
//				 WebElement el = webDriver.findElement(By.xpath(pathx));
//				 Actions action = new Actions(driver);
//				 action.moveToElement(link).perform();
//				 action.moveToElement(By.xpath(("/html/body/div[1]/header/div[3]/div/div/div[1]/ul/li[2]/div/ul/li[1]/ul/li[2]/a")).click();
//			}
//		}
		
	}*/

}
