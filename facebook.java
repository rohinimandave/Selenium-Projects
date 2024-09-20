package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "E:\\Radhika\\Selenium\\chromedriver_win32.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		CharSequence[] myemail = new CharSequence[] {"rohinimandave25@gmail.com"};
		driver.findElement(By.id("email")).sendKeys( myemail);
		CharSequence[] password = new CharSequence[] {"acjdsg"};
		driver.findElement(By.name("pass")).sendKeys(password);
		//WebElement loginButton = driver.findElement(By.name("login"));
        //loginButton.click();
	}
}
