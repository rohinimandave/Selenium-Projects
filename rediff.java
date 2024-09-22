import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "E:\\Radhika\\Selenium Maven\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        CharSequence[] username=new CharSequence[] {"xxxx@gmail.com"};
		Driver.findElement(By.id("login1")).sendKeys(username);
		CharSequence[] password=new CharSequence[] {"xxxx"};
		Driver.findElement(By.name("passwd")).sendKeys(password);
		Driver.findElement(By.className("lblkeepme")).click();
		Driver.findElement(By.className("signinbtn")).click();
		System.out.println(Driver.findElement(By.id("div_login_error")).getText());
		Driver.findElement(By.linkText("Forgot Password?")).click();
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.quit();
		
	}

}
