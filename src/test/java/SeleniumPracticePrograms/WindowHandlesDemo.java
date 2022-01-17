package SeleniumPracticePrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class WindowHandlesDemo {
	
	public static WebDriver driver;
	
	public String driverpath = "F:\\Selenium Drivers\\Chrome Driver\\Chrome Driver 96\\chromedriver_win32\\chromedriver.exe";

	public String url = "https://demoqa.com/browser-windows";

	
	
	@Test
	private void demoWindow() {

		String url = "https://www.flipkart.com/";

		System.setProperty("webdriver.chrome.driver", driverpath);

		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);

		// to close the login modal
		
		
		
		/*
		 * FluentWait wait = new FluentWait(driver);
		 * 
		 * wait.withTimeout(Duration.ofMillis(8000));
		 * wait.pollingEvery(Duration.ofMillis(300));
		 * wait.ignoring(NoSuchElementException.class) ;
		 */
		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))) ;
		
	/*
	 * WebElement we =
	 * driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")) ;
	 * wait.until(ExpectedConditions.visibilityOf(we));
	 */
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']/input")).sendKeys("Samsun");
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']/input")).sendKeys(Keys.ARROW_DOWN);

		driver.findElement(By.xpath("//div[@class='_3OO5Xc']/input")).sendKeys(Keys.ENTER);

		String parentwin = driver.getWindowHandle();

		driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F12 (Sea Green, 64 GB)')]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F22 (Denim Blue, 64 GB)')]")).click();

		Set<String> windows = driver.getWindowHandles();
		
		int count = windows.size();
		
		System.out.println("Count of windows open" + count);
		
		driver.manage().deleteAllCookies();
	
		
		
	
		
		Iterator win = windows.iterator();
		
		
		

		/*
		 * Array winarray = windows.toArray();
		 * 
		 * ArrayList windowtitles = new ArrayList(); ArrayList urls = new ArrayList();
		 * ArrayList windriverhandles = new ArrayList(); //Iterator i =
		 * windows.iterator();
		 * 
		 * for(String childwindow : windows) { driver.switchTo().window(childwindow) ;
		 * 
		 * windowtitles.add(driver.getTitle()); urls.add(driver.getCurrentUrl());
		 * windriverhandles.add(driver.getWindowHandle());
		 */

		
		
	}


}
