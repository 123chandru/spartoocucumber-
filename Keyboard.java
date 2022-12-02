package chandru;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthTextAreaUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		 driver = WebDriverManager.chromedriver().create();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 WebElement btnGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		 
		 Actions acc = new Actions(driver);
		 
		 
		 acc.contextClick(btnGmail).perform();
		 
		 Robot r = new Robot();
		 Thread.sleep(3000);
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(5000);

		 
		 
		 
			}

}
