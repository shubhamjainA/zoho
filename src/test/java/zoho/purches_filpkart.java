package zoho;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class purches_filpkart {
	
	public void demo() throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/"); //enter URL
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click(); // pop-up close
	driver.findElement(By.name("q")).click();                                     // Click on Search Field
	driver.findElement(By.name("q")).sendKeys("ipone");                           // enter Product as Iphone
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);                        // Click enter
   driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
   Set<String> firstwindow= driver.getWindowHandles();                            // handle window
	Iterator<String> itr = firstwindow.iterator();
	String main= itr.next();
	String child =itr.next();
	driver.switchTo().window(child);
   driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();// click add to cart button
   Thread.sleep(3000);
   JavascriptExecutor js = (JavascriptExecutor)driver;                                 //scrolling
   js.executeScript("scrollBy(0,1500)");
   Thread.sleep(3000);
   driver.findElement(By.xpath("(//button[@class=\"_23FHuj\"])[2]")).click();  // add a count 
//   JavascriptExecutor js = (JavascriptExecutor)driver;  
   Thread.sleep(3000);
   driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _3-J4S1\"]")).click(); // click on add to cart button 
	
   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	 
	 File dest = new File("C:\\eclipse\\screenshot\\product2.jpg");                // take screenshot 
     org.openqa.selenium.io.FileHandler.copy(src, dest);                         
  driver.close();
  driver.quit();
}
}