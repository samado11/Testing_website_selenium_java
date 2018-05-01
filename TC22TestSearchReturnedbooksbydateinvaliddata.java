package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC22TestSearchReturnedbooksbydateinvaliddata {

	TC22TestSearchReturnedbooksbydateinvaliddata(){
		System.setProperty("webdriver.gecko.driver","C:\\My Storage\\geckodriver-v0.20.1-win64_2\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();

			driver.get("http://localhost/SE604-Library_System-master/member/old_books.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).clear();
			WebElement user;
			user = driver.findElement(By.name("username"));
			user.sendKeys("aminul32");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("123456");
			
			
			
			driver.findElement(By.name("submit")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/a")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[7]/div/div/div/ul/li[3]/a")).click();
			
			driver.findElement(By.name("from")).sendKeys("2015-12-14 ");
			driver.findElement(By.name("to")).sendKeys("2015-12-14 ");
			driver.findElement(By.cssSelector("#myModal4 > div.modal-body > form > div:nth-child(3) > div > button")).click();

	}

}
