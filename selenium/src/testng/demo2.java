package testng;

import javax.security.auth.Refreshable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo2 
{
		@Test
		public void face()
		{
			System.setProperty("webdriver.chrome.driver","./softwares/geckodriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			Pom-script P=new Pom-script(driver);
			p.un_enter().sendKeys("hii");
			Thread.sleep(2000);
			driver.navigate(),refresh();
			Thread.sleep(2000);
			P.un-enter().sendKeys("world");
		}

}
