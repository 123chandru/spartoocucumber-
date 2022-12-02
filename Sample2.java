package chandru;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail");
//		driver.manage().window().maximize();
//		String placeHolderText = driver.findElement(By.xpath("//label[contains(@id,'login-label')]")).getText();
//		System.out.println(placeHolderText);
//		if(placeHolderText.equalsIgnoreCase("Username, email address or mobile number"))
//	{
//			driver.findElement(By.id("login-username")).sendKeys("chan@123");
//		}
//		else	{
//			Assert.assertTrue(false);
//		}
		String email = "chandru1234567@gmail.com";
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String text = driver.findElement(By.xpath("//div[@class='_6lux']/input")).getAttribute("placeholder");
	System.out.println(text);
	if(text.contentEquals("Email address or phone number"))
	{
		driver.findElement(By.xpath("//div[@class='_6lux']/input")).sendKeys(email);
	}
		else
		{
		Assert.assertTrue(false);
		}
}
}

