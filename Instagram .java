package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v85.debugger.model.SearchMatch;

public class Inst {

	//private static WebElement loginButton;

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "E:\\Radhika\\Selenium\\chromedriver_win32.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		CharSequence[] name=new CharSequence[] {"rohinimandave"};
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		CharSequence[] password=new CharSequence[] {"123"};
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		//driver.findElement(By.xpath("//*[@id='loginForm']")).click();
		//driver.findElement(By.id("loginForm")).click();
		//driver.findElement(By.xpath("//button[@type='submit']"));
		//loginButton.click();
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();


		
		//WebElement loginButton = driver.findElement(By.name("login"));
        //loginButton.click();
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//SearchMatch.submit();
		
	}

}
