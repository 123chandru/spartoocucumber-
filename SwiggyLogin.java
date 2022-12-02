package chandru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwiggyLogin {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	driver =WebDriverManager.chromedriver().create();
	driver.get("https://www.swiggy.in/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
//	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
//	
//	driver.findElement(By.id("mobile")).sendKeys("8668080685");
//	driver.findElement(By.className("_1FvHn'")).click();
////	String text = driver.findElement(By.xpath("//span[text()='Chandru']")).getText();
//	System.out.println(text);
	}

}
