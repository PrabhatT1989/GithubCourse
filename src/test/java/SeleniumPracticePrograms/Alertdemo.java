package SeleniumPracticePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Alertdemo {

public static WebDriver wd;
	
	public String driverpath = "F:\\Selenium Drivers\\Chrome Driver\\Chrome Driver 96\\chromedriver_win32\\chromedriver.exe";

	public String url = "https://demoqa.com/alerts";

	
	@Test(priority = 1, testName = "Alert Demo ")
	private void demoWindow() {

		

		System.setProperty("webdriver.chrome.driver", driverpath);

		wd = new ChromeDriver();

		wd.get(url);
		
		
		wd.manage().window().maximize();
		
	    
		wd.findElement(By.id("alertButton")).click();
		wd.switchTo().alert().accept();
	
		wd.findElement(By.id("timerAlertButton")).click();
		
		FluentWait wait = new FluentWait(wd);
		
		wait.withTimeout(Duration.ofMillis(10000));
		wait.pollingEvery(Duration.ofMillis(400));
		
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("clicked on accept button");
		wd.switchTo().alert().accept();
		
		
	
	}
	
	
}
