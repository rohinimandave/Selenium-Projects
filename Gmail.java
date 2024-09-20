package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "E:\\Radhika\\Selenium\\chromedriver_win32.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		CharSequence[] myEmail=new CharSequence[] {"rohinimandave25@gmail.com"};
		driver.findElement(By.id("identifierId")).sendKeys(myEmail );
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		String at= driver.getTitle();
		String et= "Gmail";
		if (at.equals(et))
		{
			System.out.println("Test is correct");
		}
		
		else 
		{
		    System.out.println("Test is wrong");
		}
		//driver.quit();
	}
    
}
