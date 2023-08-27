package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3 
{
@Test
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(1000);
	WebElement ele=driver.findElement(By.xpath("//a[text()='kannada']"));
	String txt=ele.getText();
	System.out.println()
	



}
}
