package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC7testsignuppagevaliddata {

	TC7testsignuppagevaliddata() {
		System.setProperty("webdriver.gecko.driver","C:\\My Storage\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

			driver.get("http://localhost/SE604-Library_System-master/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul/li[5]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul/li[5]/ul/li[1]/a")).click();
			
			
			WebElement user;
			user = driver.findElement(By.name("firstname"));
			user.sendKeys("abdo");
			
			driver.findElement(By.name("lastname")).sendKeys("omar");
			
			driver.findElement(By.name("username")).sendKeys("abdo70");
			driver.findElement(By.name("address")).sendKeys("abo nowal street");
			driver.findElement(By.name("roll")).sendKeys("20150153");
			driver.findElement(By.name("contact")).sendKeys("01114298193");
			driver.findElement(By.name("year_level")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[9]/div/select/option[3]")).click();
			driver.findElement(By.name("password")).sendKeys("medo7070");
			driver.findElement(By.name("submit")).click();
			
			
			
			
			
			
			

			
			
			
	}

}
