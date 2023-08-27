package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.urlContains("amazon"));
	WebElement un=driver.findElement(By.id("twotabsearchtextbox"));
	wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("oneplus");
	//driver.findElement(By.id("pass")).sendKeys("bengaluru");
		}
}