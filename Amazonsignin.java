import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsignin 
{
	public static void main(String[] args) 
	{		
		System.setProperty("Webdriver.chrome.driver", "E:\\\\Radhika\\\\Selenium Maven\\\\chromedriver-win64\\\\chromedriver-win64.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try 
		{ 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
		CharSequence[] emailid=new CharSequence[] {"gauravpatil336@gmail.com"};
		driver.findElement(By.name("email")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		CharSequence[] password=new CharSequence[] {"123456"};
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	 } 
		catch (Exception e) 
		{
         e.printStackTrace();
         System.out.println("Test case failed");
     }
		finally 
		{
    	 System.out.println("Test case passed");
         driver.quit();  
	}
	}
}

