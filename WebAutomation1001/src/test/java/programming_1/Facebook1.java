package programming_1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saiful\\Utilities");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bestbuy.com/");

	}

}
