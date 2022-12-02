package chandru;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String name = "chandru";
		//Sample1.main("Venkatesh");
		System.out.println(name);
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.espncricinfo.com");
		WebElement icon = driver.findElement(By.cssSelector("i[class*='icon-notifications-filled ds-text-icon-inverse']"));
		
		Dimension dem = new Dimension(500,250);
		driver.manage().window().setSize(dem);
	
		Thread.sleep(1000);
		
	}
}
	
//	public static void main(String name)
//		{
//		System.out.println(name);
//		}
//}
