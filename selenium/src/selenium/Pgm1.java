 package selenium;

public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./selenium/chromedriver.exe";
				System.setProperty(key, value);
		chromeDriver driver=new chromeDriver();

	}

}
