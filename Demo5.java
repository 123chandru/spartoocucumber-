package chandru;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				String name = "chandru@123";
				driver.get("https://www.spartoo.eu/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//button[@class='cookies_info-pop-buttons-accept']")).click();
				driver.findElement(By.xpath("//i[@class='icon-annuler']")).click();
				WebElement mens = driver.findElement(By.linkText("MEN"));
				Actions a = new Actions(driver);
				a.moveToElement(mens).perform();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@href='T-shirts-ET-Polo-shirts-men-st-10617-10170-0.php']")).click();
//				List<WebElement> headerSize = driver.findElements(By.xpath("(//div[@class='srub scroll-pane-arrows'])[1]"));
//					for(WebElement size : headerSize ) {
//					String text = size.getText();
//					System.out.println(text); 
//				
//					}
					//List<WebElement> headerSize = driver.findElements(By.xpath("//a[@href='T-shirts-ET-Polo-shirts-men-st-10617-10170-0.php']"));
					//for(WebElement size : headerSize ) {
					//String text = size.getText();
					//System.out.println(text); 
//				
//				driver.findElement(By.xpath("//i[@class='icon-persoCompte ']")).click();
//				
//
//				WebElement email = driver.findElement(By.xpath("//input[@name='email_address']"));
//				email.sendKeys(name);
//				email.clear();
//				
//				driver.findElement(By.name("password")).sendKeys("123456");
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//
//	
//	//	driver.findElement(By.xpath("//input[@value='"+name+"']")).clear();
//				driver.findElement(By.xpath("//form[@name='loginForm']/div[@class='loginValid']/button[@type='submit']")).click();
//				
//				driver.findElement(By.xpath("//input[@value='"+name+"']")).clear();
//				driver.manage().deleteAllCookies();
//			
//				System.out.println("//input[@value='"+name+"']");
//				
//						//input[@value='chandru@123']
				
				
				
//				driver.findElement(By.className("headerSearchBar")).click();
//				Thread.sleep(1000);
//				List<WebElement> searchOptions = driver.findElements(By.xpath("//div[@id='completeDiv']/div"));
//				for(WebElement option : searchOptions ) {
//					
//				}
//				
//				
//				
//	

	driver.quit();
}}