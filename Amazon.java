package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "E:\\Radhika\\Selenium\\chromedriver_win32.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		CharSequence[] items=new CharSequence[] {"Iphone X"};
		searchBox.sendKeys(items);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		searchBox.submit();
	}
}
