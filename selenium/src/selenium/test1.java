package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 
{
	@Test
	public void method() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
	ele.sendKeys("hii");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	ele.sendKeys("world");
	

	}

}
