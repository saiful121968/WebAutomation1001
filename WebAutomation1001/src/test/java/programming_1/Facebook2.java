package programming_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("saifil@gmail.com");
		Thread.sleep(2000);

	}

}


//<input type="email" class="inputtext" name="email" id="email" value="16102021670" tabindex="1" data-testid="royal_email">