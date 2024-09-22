import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropDown {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "E:\\\\Radhika\\\\Selenium Maven\\\\chromedriver-win64\\\\chromedriver-win64.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try 
		{ 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//x pth : //i[@class='hm-icon nav-sprite']
		// Find the All button and click on it
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
		// Create a list to fetch all the elements
		List<WebElement> list=driver.findElements(By.className("hmenu-item"));
		
		  //Iterator to iterate through the list
	       for(WebElement e : list){
	           String link = e.getText();
	           if(null!=link)
	        //Print the list
	           System.out.println(link);
	       }
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Test case failed");
			driver.quit();
			System.exit(0);
		}
		
		finally
		{
			//driver.close();
			System.out.println("Test case Passed");
		}
	
	}

}
