package chandru;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException {
	
	driver =WebDriverManager.chromedriver().create();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	
//	TakesScreenshot image = (TakesScreenshot) driver;
//	File screenshotAs = image.getScreenshotAs(OutputType.FILE);
//	File f = new File("E:\\java materials\\java project\\chu.png");
//	FileHandler.copy(screenshotAs, f);
	JavascriptExecutor js = (JavascriptExecutor) driver;
  Thread.sleep(3000);
	js.executeScript("window.scroll(0,10000)" );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	}
