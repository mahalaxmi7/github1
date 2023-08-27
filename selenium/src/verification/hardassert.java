package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert 
{
@Test
public void facebook()
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("//https:www.amazon.in");
	String title=driver.getTitle();
	Assert.assertEquals(title,"");
	System.out.println("verified");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hii");
	
}

}

