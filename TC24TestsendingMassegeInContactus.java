package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC24TestsendingMassegeInContactus {

	TC24TestsendingMassegeInContactus(){
		System.setProperty("webdriver.gecko.driver","C:\\My Storage\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

			driver.get("http://localhost/SE604-Library_System-master");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("body > div.navbar.navbar-fixed-top.navbar-inverse > div > div > div > ul > li:nth-child(7)")).click();
			
			
			
			WebElement user;
			user = driver.findElement(By.name("first_name"));
			user.sendKeys("ahmed");
			
			driver.findElement(By.name("last_name")).sendKeys("said");
			driver.findElement(By.name("email")).sendKeys("said45");
			driver.findElement(By.name("message")).sendKeys("said45");
			
	}

}
