package chandru;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class Demo2 {
	
public	WebDriver driver;
long startTime;
long endTime;
@BeforeSuite
public void launchBrowser() {
	 startTime = System.currentTimeMillis();
		driver = WebDriverManager.chromedriver().create();
}
@Test

	public void Google() {
	
	driver.get("http://facebook.com");
}
	
@Test
public void Bing() {
driver.get("http://Bing.com");
}
@Test
public void Amazom() {
	driver.get("http://amazon.com");
}
@AfterSuite
public void closeBrowser() {
	driver.quit();
    endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("total time duriation" + totalTime);
	


}
}
