package Test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBinputfromuser {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter username");
		String un=sc.next();
		System.out.println("Please enter password");
		String pw=sc.next();
		
		System.setProperty("Webdriver.chrome.driver", "E:\\Radhika\\Selenium\\chromedriver_win32.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		CharSequence[] myemail = new CharSequence[] {un};
		driver.findElement(By.id("email")).sendKeys( myemail);
		CharSequence[] password = new CharSequence[] {pw};
		//iver.findElement(By.className("pass")).sendKeys(password);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();	
	}
}

